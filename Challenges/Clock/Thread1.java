package Challenges.Clock;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.printf("\nHello from thread one you spend %d",i);
    }
}
}
