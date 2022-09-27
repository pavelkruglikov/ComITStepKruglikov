package DZ_7_2609_OPLATA;

public class Rate extends MethodOfPayment{
    public Rate(){
        super.tax = 0.2;
        super.paymentType = "Ставка";
    }
    @Override
    public double calculateOfPayment(double payment){
        double taxTotal= (double)payment * tax;
        return payment = taxTotal;
    }
}
