package oop.fudnamentals.blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogList = new ArrayList<>();

    public void add(BlogPost blogPost){
        blogList.add(blogPost);
    }

    public void delete(int index){
        blogList.remove(index);
    }

    public void update(int index, BlogPost blogPost){
        blogList.set(index, blogPost);
    }

}
