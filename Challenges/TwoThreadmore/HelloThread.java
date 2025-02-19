package Challenges.TwoThreadmore;

public class HelloThread implements Runnable{
    public int ThreadNumber;
    public HelloThread(int ThreadNumber){
        this.ThreadNumber=ThreadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {


        System.out.printf("\nhello from thread %d",ThreadNumber);
    }
    }
}
