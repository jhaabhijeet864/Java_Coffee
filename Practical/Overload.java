package Practical;

class Overload{
    void add(int a,int b){
        System.out.println("Input values of a and b: "+a+" "+b);
        System.out.println("Sum of two numbers: "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Input values of a,b and c: "+a+" "+b+" "+c);
        System.out.println("Sum of three numbers: "+(a+b+c));
    }
    double add(double a,double b){
        System.out.println("Input values of a and b: "+a+" "+b);
        return a+b;
    }
    public static void main(String args[]){
        Overload obj=new Overload();
        obj.add(2,3);
        obj.add(2,3,4);
        System.out.println("Sum of double numbers: "+obj.add(2.5,3.5));
    }
}
