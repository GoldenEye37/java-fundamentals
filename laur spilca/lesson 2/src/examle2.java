public class examle2 {
    public static void main(String[] args) throws Exception {
        // float 
        // double 

        double d1 = 10.3;
        float f1 = 10.5F; // double is precision aligned, float is accurate aligned
        float g3 = (float) 10.5; // type casting double to float

        // you can assign a float into a double but not the other way around

        d1 = f1;
        // f1 = d1; // wont work
        f1 = (float) d1;

    }
}
