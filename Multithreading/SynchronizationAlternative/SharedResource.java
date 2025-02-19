package Multithreading.SynchronizationAlternative;

public class SharedResource {
 synchronized void printNumbers(int n) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
