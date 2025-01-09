package CollectionAndGenerics.Enum;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Caution");
    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}