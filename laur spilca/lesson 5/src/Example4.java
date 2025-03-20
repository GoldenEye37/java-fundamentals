public class Example4 {
    public static void main(String[] args) {
        /* 
            && ---- AND Operator  

            short circuted AND operator 
            -> Evaluates the first expression
            -> If it matches it returns the result
        */ 

        boolean b1 = false;
        boolean b2 = false;

        boolean b3 = b1 && b2;

        System.out.println(b3);
    }
}
