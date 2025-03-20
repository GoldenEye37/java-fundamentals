public class Example2 {
    public static void main(String[] args) {
        
        int x = 10; 
        int y = 20;

        int z = x++ + 10; // 10 + 10
        int a = ++y + 12; // 21 + 12

        int b = x-- - 12; // 10 - 12

        System.out.println(z);

        System.out.println(a);

        System.out.println(b);
    }
}
