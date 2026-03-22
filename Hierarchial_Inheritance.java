class Animal {
    private void eatandbrethe() {
        System.out.println("Hi . I can eat and breathe !!");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Hi, I can bark ");
    }
}

class Cat extends Animal{
    public void sound() {
        System.out.println("Hi, I can Meow ");
    }
}

class Cow extends Animal {
    public void sound() {
        System.out.println("Hi, I can moo ");
    }
}


public class Hierarchial_Inheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Cow k = new Cow();
        d.sound();
        c.sound();
        k.sound();
    }
}