package Practical;
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
class Custom {
    static void checkAge(int age) throws MyException {
        System.out.println("Input Age: "+age);
        if(age<18) {
            throw new MyException("Age is less than 18");
        }
        else {
            System.out.println("Valid Age");
        }
    }
    public static void main(String args[]) {
        try {
            checkAge(15);
        }
        catch(MyException e) {
            System.out.println(e);
        }
    }
}

