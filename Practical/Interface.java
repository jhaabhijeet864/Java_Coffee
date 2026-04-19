package Practical;

// Renamed from Shape to MyShape to avoid colliding with your previous file
interface MyShape {
    void area();
    void length();
}

class Circle implements MyShape {
    int r = 4;

    public void area() {
        double a = 3.14 * r * r;
        System.out.println("Radius: " + r);
        System.out.println("Area: " + a);
    }

    public void length() {
        double l = 2 * 3.14 * r;
        System.out.println("Circumference: " + l);
    }
}

// Note: While naming a class "Interface" with a capital 'I' works,
// it is generally considered bad practice because it looks too similar to the 'interface' keyword!
class Interface {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.area();
        c.length();
    }
}