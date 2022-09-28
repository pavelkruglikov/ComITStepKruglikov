package DZ_7_2609;

public class Rate extends Payment {

    public Rate() {
        super.nalog = 20;
        super.paymentTypeName = "Ставка";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * (nalog + extraChildrenTax) / 100;
        return payment - nalogTotal;    }
    public double calculateOfPaymentWithoutTax(int payment) {

        return payment;
    }

}