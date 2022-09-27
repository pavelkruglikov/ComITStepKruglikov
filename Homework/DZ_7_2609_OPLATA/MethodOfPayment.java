package DZ_7_2609_OPLATA;

public abstract class MethodOfPayment {
    double tax;
    String paymentType;

    public abstract double calculateOfPayment(double payment);

    @Override
    public String toString() {
        return "MethodOfPayment{" +
                "tax=" + tax +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }


}
