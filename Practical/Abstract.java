package Practical;

abstract class Shape {
    abstract void area();
}
class Rectangle extends Shape {
    int l = 5;
    int b = 3;
    void area() {
        int a = l * b;
        System.out.println("Length of Rectangle: " + l);
        System.out.println("Width of Rectangle: " + b);
        System.out.println("Area of Rectangle: " + a);
    }
}

class Abstract {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.area();
    }
}
