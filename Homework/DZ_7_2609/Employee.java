package DZ_7_2609;

public class Employee {
    String name;
    MethodOfPayment methodOfPayment;
    int payment;
    int countOfWorkingDay;

    public void getPaymentMinusTax (MethodOfPayment type) {
        if (countOfWorkingDay!=0) {
            type.calculateOfPayment(payment+countOfWorkingDay);
        } else { type.calculateOfPayment(payment+countOfWorkingDay)
        type.calculateOfPayment(payment);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", methodOfPayment=" + methodOfPayment +
                ", payment=" + payment +
                '}';
    }
}


}
