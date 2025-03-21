public class Example1 {
    public static void main(String[] args) throws Exception {
        // Final key word argument - declaring constant value
        final int x = 10; // you can not change this value after declaration

        final int c;
        c = 10;

        final var b = 10; // using var - you have to pass the value on declaration
    }

    void method_name(final int x) {
        // you can not change the value of x 
        System.out.println(x);
    }
}
