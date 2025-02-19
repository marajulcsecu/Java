package Multithreading.SynchronizationAlternative;

public class ThreadA  extends Thread{
    SharedResource resource;
    ThreadA(SharedResource resource){
        this.resource=resource;
    }

    @Override
    public void run() {
        resource.printNumbers(5);
    }
}
