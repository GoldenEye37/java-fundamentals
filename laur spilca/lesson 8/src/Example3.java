public class Example3 {
    public static void main(String[] args) throws Exception {

        // Exploring Static key word 

        Foo f2 = new Foo();
        Foo f1 = new Foo();

        // non static value 
        f2.x = 10;

        // static value
        Foo.y = 19; // It's a class variable 
        f2.y = 20; // last value assigned to 'y' will be assigned in memory 

        System.out.println(f2.y); // 19 
        System.out.println(f1.y);
    }
}
