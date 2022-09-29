package DZ_7_2609;

public class Employee {
    String name;
    Payment typeOfPayment;
    int payment;
    int countOfWorkingDay;
    int countOfHours;
    double totalPayment;
    double roubleHalf;
    double currencyHalf;
    double award;
    int countOfChildren;
    boolean offshoreMarker;

    public void getAward() { // не считает для дней!
        if (offshoreMarker) {
            this.award = 0;
        } else if (countOfHours > 200 | countOfWorkingDay > 9) {
            this.award = 1000;
        } else this.award = 0;
    }


    public void getPaymentMinusTax() {
        if (offshoreMarker) {
            if (countOfWorkingDay > 0) {
                this.totalPayment = award + (typeOfPayment.calculateOfPaymentWithoutTax(payment * countOfWorkingDay));
            } else {
                totalPayment = award + typeOfPayment.calculateOfPaymentWithoutTax(payment);
            }
        } else {
            if (countOfWorkingDay > 0) {
                this.totalPayment = award + typeOfPayment.calculateOfPayment(payment * countOfWorkingDay);
            } else {
                totalPayment = award + typeOfPayment.calculateOfPayment(payment);

            }
        }
    }


    public void getPaymentMinusTaxForHourly() {


        if (offshoreMarker) {
            this.totalPayment = award + typeOfPayment.calculateOfPaymentWithoutTax(payment * countOfHours);
            this.roubleHalf = totalPayment / 2;
            this.currencyHalf = (totalPayment / 2) / 2.5;
        } else {
            this.totalPayment = award + typeOfPayment.calculateOfPayment(payment * countOfHours);
            this.roubleHalf = totalPayment / 2;
            this.currencyHalf = (totalPayment / 2) / 2.5;
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";


    @Override
    public String toString() {
        return name +
                " Тип оплаты = " + typeOfPayment +
                ANSI_BLUE + " Такса = " + payment +
                " За " + countOfWorkingDay + " дней " + ANSI_RESET +
                " Оффшор = " + offshoreMarker +
                ANSI_GREEN + " Итоговая выплата = " + totalPayment + ANSI_RESET +
                " В т.ч. премия = " + award;
    }

    public String toStringHourlyMethod() {
        return name +
                " Оплата = " + (typeOfPayment) +
                ANSI_BLUE + " Такса = " + payment +
                " За " + countOfHours + " часов " + ANSI_RESET +
                " Оффшор = " + offshoreMarker +
                ANSI_GREEN + " Итоговая выплата = " + totalPayment + ANSI_RESET +
                " В т.ч. премия = " + award +
                ANSI_YELLOW + ", Рубли = " + roubleHalf +
                " Валюта = " + currencyHalf + ANSI_RESET;
    }

    public String toStringPieceWorkMethod() {
        return name +
                " Тип оплаты = " + typeOfPayment +
                " Оффшор = " + offshoreMarker +
                " Такса = " + payment +
                ANSI_GREEN + " Итоговая выплата = " + totalPayment + ANSI_RESET +
                " В т.ч. премия = " + award;
    }
}
