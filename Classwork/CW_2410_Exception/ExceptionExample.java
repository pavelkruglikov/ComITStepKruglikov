package CW_2410_Exception;

public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();
        try {
            exceptionExample.checkedMethod1();

        } catch (CheckedException e) {
            System.out.println(e.getMessage());
        }
        try {
            exceptionExample.checkedMethod2();

        } catch (CheckedException e) {
            System.out.println(e.getMessage());
        }
        try {
            exceptionExample.uncheckedMethod1();

        } catch (UncheckedException e) {
            System.out.println(e.getMessage());
        }
        try {
            exceptionExample.uncheckedMethod2();

        } catch (UncheckedException e) {
            System.out.println(e.getMessage());
        }

    }

    public void checkedMethod1() throws CheckedException {
        throw new CheckedException("1 checked case");
    }

    public void checkedMethod2() throws CheckedException {
        throw new CheckedException("2 checked case");
    }

    public void uncheckedMethod1() throws UncheckedException {
        throw new UncheckedException("1 unchecked case");

    }

    public void uncheckedMethod2() throws UncheckedException {
        throw new UncheckedException("2 unchecked case");
    }
}
