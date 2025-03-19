public class Example5 {
    public static void main(String[] args) {
        // break    vs   continue

        var i = 8;

        while (true) {
            i = i + 1;
            if (i==11){
                break;
            }
        }

        while (true) {
            i = i + 1;
            if (i % 2 == 0) {
                continue; // code below will not be executed!
            }
            System.out.println(i);
        }
    }
}
