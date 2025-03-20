public class Example1 {
    public static void main(String[] args) throws Exception {
        int i = 1, j = 1;

        A: while (i <= 3) {
            B: while (j <= 3) {
                if (j % 2 == 0) {
                    break A;
                }      
                j = j + 1;          
            }

            i = i + 1;
        }
    }
}
