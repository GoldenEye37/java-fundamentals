public class Example3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20; 

        int a = x++ + ++y; // 10 + 21
        System.out.println(y);

        int b = ++x + y++; // 11 + 21 + 1
        System.out.println(a);

        System.out.println(b);

        System.out.println(y);
    }
}
