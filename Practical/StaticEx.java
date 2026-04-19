package Practical;

class StaticEx {
    static int a = 10;
    static {
        System.out.println("Static Block");
    }
    static void show() {
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        System.out.println(a);
        show();
    }
}
