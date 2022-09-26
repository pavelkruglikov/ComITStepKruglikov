package DZ_7_2609;

public class Hourly extends MethodOfPayment{

    public Hourly (int payment){
        super.tax = 15;
        super.payment = payment;
        super.paymentTypeName = "Почасовая";

    }
}

