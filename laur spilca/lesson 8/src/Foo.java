public class Foo {
    // you don't need to have an instance to access a static variable
    int x;
    static int y; // you can't have static values locally 

    final static int z = 10; // since this is a static attribute you assign the value before instanciation
    final static int s;

    final int w;
    {
        w =50;
    }

    // how to declare statis outside
    static {
        s = 19;
    }
    
}
