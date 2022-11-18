package oop.fundamentals.blog;

public class Main {
    /*
    Reuse your BlogPost class
    Create a Blog class which can:
        store a list of BlogPosts
        and has the following methods:
            add(BlogPost) -> adds a BlogPost to the list
            delete(int) -> deletes the BlogPost from the given index
            update(int, BlogPost) -> replaces an item at the given index with a new BlogPost
     */
    public static void main(String[] args) {

        Blog blog = new Blog();

        BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "2010.10.10.");
        BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n" +
                        "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
                "2017.03.28.");

        blog.add(blogPost1);
        blog.add(blogPost2);
        for (int i = 0; i < blog.blogList.size(); i++) {
            System.out.println(blog.blogList.get(i).toString());
        }
        System.out.println();

        blog.delete(0);
        for (int i = 0; i < blog.blogList.size(); i++) {
            System.out.println(blog.blogList.get(i).toString());
        }
        System.out.println();
        blog.update(0, blogPost3);
        for (int i = 0; i < blog.blogList.size(); i++) {
            System.out.println(blog.blogList.get(i).toString());
        }
    }
}
