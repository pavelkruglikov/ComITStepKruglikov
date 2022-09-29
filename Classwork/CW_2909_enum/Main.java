package CW_2909_enum;

public class Main {
    public static void main(String[] args) {
        VerifyDay startCheck = new CheckingDay();
        DaysOfWeek[] array = DaysOfWeek.values();
        for (DaysOfWeek day : array
        ) {
            startCheck.verifyDay(day);
        }

    }
}
