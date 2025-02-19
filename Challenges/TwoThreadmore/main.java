package Challenges.TwoThreadmore;

public class main {
    public static void main(String[] args) {
        HelloThread ht1= new HelloThread(1);
        HelloThread ht2 = new HelloThread(2);
        Thread t1 = new Thread(ht1);
        Thread t2 = new Thread(ht2);
        t1.start();
        t2.start();
    }
}
