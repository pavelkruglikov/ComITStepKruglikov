package CW_0410_Framework.Interface;

import CW_0410_Framework.Elements.PasswordField;

public interface HasPassword {

    PasswordField getPasswordField ();

    default void verifyPassword () {
        if (getPasswordField().getInfo().equals("null")){
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
