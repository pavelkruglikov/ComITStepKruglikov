package CW_2909_enum;

public enum DaysOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятввница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String name;

    DaysOfWeek (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}




