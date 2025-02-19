package Multithreading.SynchronizationAlternative;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        ThreadA t1= new ThreadA(resource);
        ThreadB t2 = new ThreadB(resource);
        t1.start();
        t2.start();

    }
}
