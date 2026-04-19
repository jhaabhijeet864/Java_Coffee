package Practical;

class ThreadMethod extends Thread{
    public void run(){
        try{
            for(int i=1;i<=3;i++){
                System.out.println(Thread.currentThread().getName()+" value: "+i);
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        ThreadMethod t1=new ThreadMethod();
        ThreadMethod t2=new ThreadMethod();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        System.out.println("Starting "+t1.getName());
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
        System.out.println("Starting "+t2.getName());
        t2.start();
        System.out.println("Is Thread 1 alive: "+t1.isAlive());
    }
}
