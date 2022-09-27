package DZ_7_2609_OPLATA;

public class Hourly extends MethodOfPayment{
    public Hourly() {
        super.tax = 0.2;
        super.paymentType = "Почасовая";
    }
    @Override
    public double calculateOfPayment(double payment){
        double taxTotal= (double)payment * tax;
        return payment = taxTotal;
    }
}
