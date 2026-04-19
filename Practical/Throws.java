package Practical;

class Throws {
    void checkAge(int age) throws ArithmeticException {
        System.out.println("Input Age: "+age);
        if(age<18) {
            throw new ArithmeticException("Not Eligible for Voting");
        }
        else {
            System.out.println("Eligible for Voting");
        }
    }
    public static void main(String args[]) {
        Throws obj=new Throws();
        obj.checkAge(16);
    }
}

