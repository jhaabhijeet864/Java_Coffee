package multithreading;

/*
What is Thread?
-> A thread is a single sequential flow of execution within a program
-> Thread is a "Light Weight Process" -> because it uses less resources

- Types of Threads
1. main - high priority thread (User Thread)
2. Daemon  - low priority thread (Priority : 1) -> Garbage Collector
*/

/*
 LIFE CYCLE OF THREAD
 1. Newborn state (New)
 2. Runnable state
 3. Running state
 4. Blocked state (Waiting/Sleeping)
 5. Dead state (Terminated)
 */

public class multi_threading extends Thread {
    // A single hand handling multiple parts of the program.
    // Thread is a subset of process

    // The run() method contains the code that the new thread will execute
    @Override
    public void run() {
        // Fixed typo: 'fir' to 'for', and gave print() an argument
        for (int i = 1; i <= 10; i++) {
            System.out.println("Custom Thread counting: " + i);

            try {
                // Pausing the thread for 500ms to simulate work and show Blocked state
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {

        // 1. Newborn state: Creating the thread object
        multi_threading myThread = new multi_threading();

        // 2. Runnable state: Calling start() moves it to runnable (JVM decides when it runs)
        myThread.start();

        // The Main thread runs this loop at the exact same time as the custom thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread counting: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        // 5. Dead state: Threads die automatically when their run() or main() method finishes
    }
}