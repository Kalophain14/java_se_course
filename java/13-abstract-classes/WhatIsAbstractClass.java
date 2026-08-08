package WhatIsAbstractClass;

/*

Abstract Class
- You cannot define an abstract method (undefined)
- You cannot create the object
- You can create a reference (below)
- Reference Animal test1
- It must be declared as an abstract
- It could have 0 or more abstract methods

Concrete Class
- You can create the object
- You can create a reference as well as an object (below)
- Animal test1 = new Animal
- It doesn't adopt the abstract class when it inheritance from super
*/

// Abstract Class
abstract class Animal {
    // Constructor
    Animal (){
        System.out.println("Animal");
    }

    void eat(){
        System.out.println("Animals are eating");
    }

    // abstract method
    abstract void sleep();
}

// Concrete classes
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping");
    }
}
    class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog  is eating");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping");
    }
}

    public class WhatIsAbstractClass {
    public static void main(String[] args) {
        Animal breeds1 = new Cat();
        breeds1.eat();
        breeds1.sleep();
    }
}
