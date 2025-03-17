package demo;

class Cat {
    // Rules for Identifiers 
    // Class names can not take keywords' names

    // String is the Data Type -> Java is static typed
    // for integral values  --- 4 bytes

    // int is a primitive data type - (part of the  8 data types)
    // primitive data types are like keywords

    /*
     * byte, short, int, float, double, char, boolean 
    */

    String name;
    int age;

    Cat() {
        System.out.println("Cat Has been Created");
    }

    /* 
    - behavior defines object actions - what an object can do
    - method names should be verbs
    - void returns nothing
    */
    void sayMeow() {
        System.out.println("Meow! My name is " + this.name);
    }
}
