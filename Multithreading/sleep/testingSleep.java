package Multithreading.sleep;

public class testingSleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Before Sleeping");
        Thread.sleep(10000);
        System.out.println("Woke up");
    }
}
