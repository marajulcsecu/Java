package Challenges.traficLight;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red = new TrafficLight(TrafficColor.RED);
        TrafficLight yellow = new TrafficLight(TrafficColor.YELLOW);
        TrafficLight green = new TrafficLight(TrafficColor.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
    }
}
