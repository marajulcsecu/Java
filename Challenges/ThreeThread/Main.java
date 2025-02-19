package Challenges.ThreeThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        threeThread t1= new threeThread(1);
        threeThread t2 = new threeThread(2);
        threeThread t3 = new threeThread(3);

        t1.start();
        t1.join();
        System.out.printf("thread finished: %s",t1.getState());
        t2.start();
        t2.join();
        System.out.printf("thread finished: %s",t2.getState());
        t3.start();
        t3.join();
        System.out.printf("thread finished: %s",t3.getState());



    }
}
