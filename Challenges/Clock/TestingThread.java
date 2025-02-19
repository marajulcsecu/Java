package Challenges.Clock;

public class TestingThread {
    public static void main(String[] args) throws InterruptedException{
        Thread1 one = new Thread1();


one.start();
one.join();
        System.out.println("finished.");

    }
}