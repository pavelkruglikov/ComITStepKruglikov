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

    public void setAward() {
        if (offshoreMarker) {
            this.award = 0;
        } else if (countOfHours > 200 || countOfWorkingDay > 9) {
            this.award = 500;
        }
    }

    public void getPaymentMinusTax() {
        if (offshoreMarker) {
            if (countOfWorkingDay > 0) {
                this.totalPayment = typeOfPayment.calculateOfPaymentWithoutTax(payment * countOfWorkingDay);
            } else {
                totalPayment = typeOfPayment.calculateOfPaymentWithoutTax(payment);
            }
        } else {
            if (countOfWorkingDay > 0) {
                this.totalPayment = typeOfPayment.calculateOfPayment(payment * countOfWorkingDay);
            } else {
                totalPayment = typeOfPayment.calculateOfPayment(payment);

            }
        }
    }


    public void getPaymentMinusTaxForHourly() {


        if (offshoreMarker) {
            this.totalPayment = typeOfPayment.calculateOfPaymentWithoutTax(payment * countOfHours);
            this.roubleHalf = typeOfPayment.calculateOfPaymentWithoutTax(payment * countOfHours) / 2;
            this.currencyHalf = (typeOfPayment.calculateOfPaymentWithoutTax(payment * countOfHours) / 2) / 2.5;
        } else {
            this.totalPayment = typeOfPayment.calculateOfPayment(payment * countOfHours);
            this.roubleHalf = typeOfPayment.calculateOfPayment(payment * countOfHours) / 2;
            this.currencyHalf = (typeOfPayment.calculateOfPayment(payment * countOfHours) / 2) / 2.5;
        }
    }


    @Override
    public String toString() {
                return name + '\'' +
                ", Такса = " + payment +
                ", Тип оплаты = " + typeOfPayment +
                ", Количество рабочих дней = " + countOfWorkingDay +
                ", Итоговая выплата = " + totalPayment;
    }

    public String toStringHourlyMethod() {
        return name + '\'' +
                ", Такса = " + payment +
                ", Тип оплаты =" + typeOfPayment +
                ", Количество рабочих часов =" + countOfHours +
                ", Итоговая выплата = " + totalPayment +
                ", Премия = " + award +
                ", Часть в рублях = " + roubleHalf +
                ", Часть в долларах = " + currencyHalf;
    }
}