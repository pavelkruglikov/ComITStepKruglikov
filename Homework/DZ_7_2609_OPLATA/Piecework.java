package DZ_7_2609_OPLATA;

public class Piecework extends MethodOfPayment{
    public Piecework() {
        super.tax = 0.15;
        super.paymentType = "Сдельная";
    }
    @Override
    public double calculateOfPayment(double payment){
        double taxTotal= (double)payment * tax;
        return payment = taxTotal;
    }
}
