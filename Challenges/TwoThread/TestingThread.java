package Challenges.TwoThread;

public class TestingThread {
    public static void main(String[] args) throws InterruptedException{
        Thread1 one = new Thread1();
        Thread2 two = new Thread2();

one.start();

two.start();

    }
}