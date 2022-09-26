package DZ_7_2609;

public abstract class  MethodOfPayment {
    String paymentTypeName;
    int tax;
    int payment;
    int paymentMinusTax;


    public abstract double calculateOfPayment(int payment);

    @Override
    public String toString() {
        return "MethodOfPayment{" +
                "paymentTypeName='" + paymentTypeName + '\'' +
                ", tax=" + tax +
                '}';
    }
}
