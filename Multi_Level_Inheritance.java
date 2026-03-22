class b1 {
    protected  void Funb1() {
        System.out.println("I am from B1 Class");
    }
}

class b2 extends b1 {
    protected void Funb1() {
        System.out.println("Hi, i am form b2 class");
    }
}

class b3 extends b2 {
    protected void Funb1() {
        System.out.println("Hi, i am form b3 class");
    }
}

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        b1 b = new b1();
        b1 m = new b2();
        b3 k = new b3();
        b.Funb1();
        b.Funb1();

    }
}
