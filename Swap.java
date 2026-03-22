public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a = a + b;
        b = a - b;
        b = a - b;
        System.out.print("a is" + a + "b is" + b);
    }
}
