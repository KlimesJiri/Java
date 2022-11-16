package oop.inheritance.minecraft;

import java.util.ArrayList;
import java.util.List;

public class Wall {

    List<Block> blocks = new ArrayList<>();

    void placeBlock(Block block){
        if (blocks.isEmpty()){
            blocks.add(block);
            return;
        }
        if (block.canPlaceAfter(blocks.get(blocks.size() - 1))){
            if (block.getTransformations().containsKey(blocks.get(blocks.size()-1).getType())){
                block.getPrevious(blocks.get(blocks.size() - 1));
                block.setMadeTransformation();
                blocks.set(blocks.size() - 1, block.getTransformations().get(blocks.get(blocks.size()-1).getType()));
            }
            blocks.add(block);
        }
    }

    void printStatus(){
        for (Block block : blocks){
            block.printStatus();
            System.out.println();
        }
    }

    void calculateLight(){
        int transmission = 0;
        for (Block block : blocks){
            transmission += block.getTransmission();
        }
        transmission /= blocks.size();
        System.out.println("Light transmitted: " + transmission);
    }

}
