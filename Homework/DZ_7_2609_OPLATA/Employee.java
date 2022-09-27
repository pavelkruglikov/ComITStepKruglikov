package DZ_7_2609_OPLATA;

public class Employee {
    String name;
    MethodOfPayment paymentType;
    int payment;
    int countOfWorkingDays;
    int countOfWorkingHours;
    double totalPayment;
    boolean hasChildren;


    public void getPaymentWithoutTax() {
        if (countOfWorkingDays != 0) {
            this.totalPayment = paymentType.calculateOfPayment(payment * countOfWorkingDays);
        } else if (countOfWorkingHours != 0) {
            this.totalPayment = paymentType.calculateOfPayment(payment * countOfWorkingHours);
        } else {
            this.totalPayment = paymentType.calculateOfPayment(payment);

        }
        System.out.println();

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", paymentType=" + paymentType +
                ", payment=" + payment +
                ", countOfWorkingDays=" + countOfWorkingDays +
                ", countOfWorkingHours=" + countOfWorkingHours +
                ", totalPayment=" + totalPayment +
                ", hasChildren=" + hasChildren +
                '}';
    }
}

