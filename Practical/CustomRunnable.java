package Practical;

// Renamed to CustomRunnable so we don't conflict with Java's built-in interface
class CustomRunnable implements Runnable {

    public void run() {
        int n = 7;
        System.out.println("Table of " + n + " using Runnable (Thala for a Reason):");
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String args[]) {
        CustomRunnable r = new CustomRunnable();

        // Because we fixed the naming conflict, we can just use standard 'Thread' now
        Thread t = new Thread(r);

        System.out.println("Starting Runnable Thread...");
        t.start();
    }
}