package DZ_7_2609;

public class Piecework extends MethodOfPayment{

    public Piecework(int payment){
        super.tax = 15;
        super.payment = payment;
        super.paymentTypeName = "Сделка";
    }
}
