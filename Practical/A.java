package Practical;

interface A {
    void show();
}
interface B {
    void display();
}
class Multi implements A, B {
    public void show() {
        System.out.println("Interface A");
    }
    public void display() {
        System.out.println("Interface B");
    }
    public static void main(String[] args) {
        Multi obj = new Multi();
        obj.show();
        obj.display();
    }
}
