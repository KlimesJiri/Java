package oop.fudnamentals.sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    private List<Sharpie> sharpieList = new ArrayList<>();

    public void addSharpie(Sharpie sharpie){
        sharpieList.add(sharpie);
    }

    public int countUsable(){
        int count = 0;
        for (Sharpie sharpie : sharpieList){
            if (sharpie.getInkAmount() > 0){
                count++;
            }
        }
        return count;
    }

    public void removeThrash(){
        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).getInkAmount() <= 0){
                sharpieList.remove(i);
            }
        }
    }

    public List<Sharpie> getSharpieList() {
        return sharpieList;
    }
}
