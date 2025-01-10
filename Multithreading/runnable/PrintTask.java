package Multithreading.runnable;

public class PrintTask implements Runnable {

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        //printTask
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n %s %c  task completed",
                Thread.currentThread().getName(),
                targetChar);
    }
    private final char targetChar;
}
