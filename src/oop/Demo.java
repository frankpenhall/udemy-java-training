package oop;

class Person {
    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

public class Demo {

    public static void main(String[] args) {
        // Instantiating an object
        Person person1 = new Person();

        // Define some properties
        person1.name = "Joe";
        person1.email = "joe@testemail.com";
        person1.phone = "1938710342";

        // Abstraction
        person1.walk();
        person1.sleep();
        person1.eat();

        Person person2 = new Person();

        person2.name = "Bob";
        person2.email = "bob@testemail.com";

        person2.sleep();
        person2.walk();

    }

}

