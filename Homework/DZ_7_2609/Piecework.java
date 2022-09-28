package DZ_7_2609;

public class Piecework extends Payment {

    public Piecework() {
        super.nalog = 15;
        super.paymentTypeName = "Сделка";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * (nalog + extraChildrenTax) / 100;
        return  payment - nalogTotal;
    }
    public double calculateOfPaymentWithoutTax(int payment) {

        return payment;
    }

}