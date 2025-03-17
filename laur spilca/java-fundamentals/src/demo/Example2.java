package demo;

public class Example2 {
    public static void main(String[] args) {
        /*
         * Identifier rules 
         
         - They can not start with a number
         - Can not have a space 
         - can not be an operator -> +, - , =
         - can not contain special chars -> 

         new Cat() -> default constructor 

         Constructor Rules 

         - Custom constructor does not return anything
         - has the same name as class Name
         - 
         * 
        */

        Cat c = new Cat(); // assign and instanciation
        
        c.name = "Tom";
        c.age = 12;

        c.sayMeow();

        // declare another cat 
        var x = new Cat();
        x.name = "Loe";
        x.age = 12; 
        x.sayMeow();
    }
}
