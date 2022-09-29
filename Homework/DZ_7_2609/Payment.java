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

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Override
    public String toString() {
        return paymentTypeName +
                ANSI_RED + " Налог общий = " + (nalog + extraChildrenTax) + ANSI_RESET +
                ANSI_PURPLE + " в т.ч детские = " + extraChildrenTax + ANSI_RESET;
    }
}