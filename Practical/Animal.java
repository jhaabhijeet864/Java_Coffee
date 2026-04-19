package Practical;

class Animal{
    void sound(){
        System.out.println("Animal sound method called");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog sound method called");
    }
}
class Override{
    public static void main(String args[]){
        Dog d=new Dog();
        System.out.println("Object created for Dog class");
        d.sound();
    }
}
