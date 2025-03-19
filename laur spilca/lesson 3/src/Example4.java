public class Example4 {
    public static void main(String[] args) {
        // nested if-else
        int x = 50;
        int y = 20;
        int z = 30;

        if (x < y) {
            System.out.println("");
            if (y < z){
                System.out.println("B");
            } 
            else{
                System.out.println("Not defined");
            }
        }
    }
}
