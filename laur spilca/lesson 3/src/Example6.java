public class Example6 {
    public static void main(String[] args) {
        int x = 10;

        switch (x) {
            case 12 -> System.out.println("A");
            default -> System.out.println("B");
        }

        int y = switch (x) {
            case 13 -> 140;
            default -> 345;
        };
    }
}
