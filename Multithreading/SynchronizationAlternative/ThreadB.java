package Multithreading.SynchronizationAlternative;

public class ThreadB extends Thread{
    SharedResource resource;
    ThreadB(SharedResource resource){
        this.resource=resource;

    }

    @Override
    public void run() {
        resource.printNumbers(10);
    }
}
