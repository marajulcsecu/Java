package Challenges.ThreadState;

public class threadState extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\nform inside run %s", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
