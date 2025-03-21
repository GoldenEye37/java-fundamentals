public class Example3 {
    public static void main(String[] args) throws Exception {
        final int b = 19; 
        int x = 10;
        int y = 10;

        x = x + 1;
        x += 1;
        x += y;

        // b += y; // can not happen because it's a constant 

        x *= y;
        x -= y;
        x /= y;
        x %= y;
    }
}
