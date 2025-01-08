package Challenges;

public enum DayEnum {
    SATURDAY(true),
    SUNDAY(true),
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(true);

    private final boolean isWeekend;

    DayEnum(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
    public String getType(){
        return isWeekend ? "weeekend" : "weekday";
    }
}
