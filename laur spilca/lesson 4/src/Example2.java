public class Example2 {

    public static void main(String[] args) {
        Cat c1 = new Cat("Tom", 10); // A
        Cat c2 = new Cat("Tom", 10); // B they are in 2 different address locations

        // == !=
        boolean b1 = c1 == c2; // false
        boolean b2 = c1 != c2; // true

    }
}


class Cat {
    String name;
    int age;

    // constructor
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
}
