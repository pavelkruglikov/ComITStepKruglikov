package DZ_7_2609;

public abstract class Payment {

    String paymentTypeName;
    int nalog;
    int extraChildrenTax;

    public void setExtraChildrenTax(int extraChildrenTax) {
        if (extraChildrenTax > 0) {
            this.extraChildrenTax = 0;
        } else {
            this.extraChildrenTax = 5;
        }
    }

    public abstract double calculateOfPayment(int payment);

    public abstract double calculateOfPaymentWithoutTax(int payment);

    @Override
    public String toString() {
        return paymentTypeName +
                ", Налог общий = " + (nalog + extraChildrenTax) +
                ", из них детский коэффициент = " + extraChildrenTax;
    }
}