package CW_0410_Framework.Interface;

import CW_0410_Framework.Block.WindowOfRegistration;

public interface HasSubmitButton {

    WindowOfRegistration getWindowReg ();


    default void verifySubmitButton () {
        if (getWindowReg().submitButton.getLink().equals("AnyLink")){
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
