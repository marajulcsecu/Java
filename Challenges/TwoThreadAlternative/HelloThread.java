package Challenges.TwoThreadAlternative;

public class HelloThread extends Thread {
    public int threadNumber;
    public HelloThread (int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nHello from thread-%d",threadNumber);
        }
    }
}
