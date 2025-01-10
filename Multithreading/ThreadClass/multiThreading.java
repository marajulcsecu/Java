package Multithreading.ThreadClass;

public class multiThreading {

    public static void main(String[] args) {
        long startTime =System.currentTimeMillis();

        FirstTask t1= new FirstTask();
        SecondTask t2=new SecondTask();
        ThirdTask t3=new ThirdTask();
        System.out.println("stating first thread");
        t1.start();
        System.out.println("starting second thread");
        t2.start();
        System.out.println("starting third thread");
        t3.start();



        long endTime=System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",Thread.currentThread().getName()
                ,(endTime-startTime));

    }
    }


