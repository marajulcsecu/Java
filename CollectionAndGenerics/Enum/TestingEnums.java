package CollectionAndGenerics.Enum;

public class TestingEnums {

    public static void main(String[] args) {

TrafficLight color = TrafficLight.RED;
color=TrafficLight.GREEN;

        Grade grade = Grade.C;
//        System.out.println(TrafficLight.valueOf("Go"));
        System.out.println(color);

        for (TrafficLight value : TrafficLight.values()) {
            System.out.println(value);
        }

    }
}
