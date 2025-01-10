package Multithreading.ThreadClass;

public class FirstTask extends Thread {

    @Override
    public void run() {
        //first task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.printf("\n %s *  task completed",Thread.currentThread().getName());
    }
}
