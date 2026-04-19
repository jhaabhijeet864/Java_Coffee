package Practical;

class TryCatch{
    public static void main(String args[]){
        int a=10;
        int b=0;
        System.out.println("Input values: a="+a+" b="+b);
        try{
            int c=a/b;
            System.out.println("Result: "+c);
        }catch(Exception e){
            System.out.println("Exception Occurred: Division by zero");
        }finally{
            System.out.println("Finally Block Executed");
        }
    }
}

