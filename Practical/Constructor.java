package Practical;

class Constructor {
    int x;
    String name;
    Constructor() {
        x = 0;
        name = "Default";
    }
    Constructor(int a, String n) {
        x = a;
        name = n;
    }
    Constructor(int a) {
        x = a;
        name = "Non-Parameterized";
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(10, "Java");
        Constructor c3 = new Constructor(20);
        System.out.println(c1.x + " " + c1.name);
        System.out.println(c2.x + " " + c2.name);
        System.out.println(c3.x + " " + c3.name);
    }
}

