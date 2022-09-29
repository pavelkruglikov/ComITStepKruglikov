package DZ_7_2609;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Payment pay = new Hourly();
        employee1.name = "Андреев В.Г";
        employee1.payment = 300;
        employee1.typeOfPayment = pay;
        employee1.countOfHours = 300;
        employee1.countOfChildren = 0;
        employee1.offshoreMarker = false;
        employee1.getAward();
        pay.setExtraChildrenTax(employee1.countOfChildren);
        if (employee1.countOfHours > 0) {
            employee1.getPaymentMinusTaxForHourly();
            System.out.println(employee1.toStringHourlyMethod());
        } else if (employee1.countOfWorkingDay > 0) {
            employee1.getPaymentMinusTax();
            System.out.println(employee1.toString());
        } else {employee1.getPaymentMinusTax();
            System.out.println(employee1.toStringPieceWorkMethod());
        }

        Employee employee2 = new Employee();
        Payment pay2 = new Piecework();
        employee2.name = "Борисов Г.В";
        employee2.payment = 1800;
        employee2.typeOfPayment = pay2;
        employee2.countOfChildren = 2;
        employee2.offshoreMarker = true;
        employee2.getAward();
        pay.setExtraChildrenTax(employee2.countOfChildren);
        if (employee2.countOfHours > 0) {
            employee2.getPaymentMinusTaxForHourly();
            System.out.println(employee2.toStringHourlyMethod());
        } else if (employee2.countOfWorkingDay > 0) {
            employee2.getPaymentMinusTax();
            System.out.println(employee2.toString());
        } else {employee2.getPaymentMinusTax();
            System.out.println(employee2.toStringPieceWorkMethod());
        }

        Employee employee3 = new Employee();
        Payment pay3 = new Hourly();
        employee3.name = "Волков С.Ф";
        employee3.payment = 50;
        employee3.countOfHours = 200;
        employee3.typeOfPayment = pay3;
        employee3.countOfChildren = 1;
        employee3.offshoreMarker = false;
        employee3.getAward();
        pay.setExtraChildrenTax(employee2.countOfChildren);
        if (employee3.countOfHours > 0) {
            employee3.getPaymentMinusTaxForHourly();
            System.out.println(employee3.toStringHourlyMethod());
        } else if (employee3.countOfWorkingDay > 0) {
            employee3.getPaymentMinusTax();
            System.out.println(employee3.toString());
        } else {employee3.getPaymentMinusTax();
            System.out.println(employee3.toStringPieceWorkMethod());
        }

        Employee employee4 = new Employee();
        Payment pay4 = new Piecework();
        employee4.name = "Голубев С.П";
        employee4.payment = 1000;
        employee4.typeOfPayment = pay4;
        employee4.countOfChildren = 1;
        employee4.offshoreMarker = false;
        employee4.getAward();
        pay.setExtraChildrenTax(employee2.countOfChildren);
        if (employee4.countOfHours > 0) {
            employee4.getPaymentMinusTaxForHourly();
            System.out.println(employee4.toStringHourlyMethod());
        } else if (employee4.countOfWorkingDay > 0) {
            employee4.getPaymentMinusTax();
            System.out.println(employee4.toString());
        } else {employee4.getPaymentMinusTax();
            System.out.println(employee4.toStringPieceWorkMethod());
        }

        Employee employee5 = new Employee();
        Payment pay5 = new Rate();
        employee5.name = "Дятлов В.В";
        employee5.payment = 50;
        employee5.countOfWorkingDay = 14;
        employee5.typeOfPayment = pay5;
        employee5.countOfChildren = 1;
        employee5.offshoreMarker = true;
        employee5.getAward();
        pay.setExtraChildrenTax(employee5.countOfChildren);
        if (employee5.countOfHours > 0) {
            employee5.getPaymentMinusTaxForHourly();
            System.out.println(employee5.toStringHourlyMethod());
        } else if (employee5.countOfWorkingDay > 0) {
            employee5.getPaymentMinusTax();
            System.out.println(employee5.toString());
        } else {employee5.getPaymentMinusTax();
            System.out.println(employee5.toStringPieceWorkMethod());
        }
    }
}