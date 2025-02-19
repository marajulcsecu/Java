package Challenges.ThreeThread;

public class threeThread extends Thread{
    public  int number;
    public  threeThread(int number){
        this.number= number;
    }

    @Override
    public void run() {
        System.out.printf("\nthread number: %s and it started: %s\n",number,
                getState());
    }
}
