package Practical;

class A{
    int a;
    A(int x){
        this.a=x;
    }
}
class SuperThis extends A{
    int b;
    SuperThis(int x,int y){
        super(x);
        this.b=y;
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]){
        SuperThis obj=new SuperThis(5,15);
        obj.show();
    }
}
