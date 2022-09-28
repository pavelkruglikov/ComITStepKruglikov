package DZ_7_2609;

public class Hourly extends Payment {

    public Hourly() {
        super.paymentTypeName = "Почасовая";
        super.nalog = 20;
    }

    @Override
    public double calculateOfPayment(int payment) {

        double nalogTotal = (double) payment * (nalog + extraChildrenTax) / 100;
        return payment - nalogTotal;
    }

    public double calculateOfPaymentWithoutTax(int payment) {

        return payment;
    }

}
