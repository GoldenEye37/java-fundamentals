package demo;

public class Example1 {
    public static void main(String[] args) throws Exception {
        // creating a cat 
        Cat x = new Cat();

        Cat y;
        y = new Cat(); // new is a keyword 

        // var and new are keywords
        var z = new Cat(); 

        // print
        x.name = "Mouse";
        x.age = 23;

        // print
        System.out.println("X has the name {}");
        System.out.println(x.name);
    }
}
