package CW_0410_Framework.Block;

import CW_0410_Framework.Elements.CheckBox_RememberPassword;
import CW_0410_Framework.Elements.NickNameField;
import CW_0410_Framework.Elements.PasswordField;
import CW_0410_Framework.Elements.SubmitButton;
import CW_0410_Framework.Interface.HasPassword;

public class WindowOfRegistration implements HasPassword {

    public CheckBox_RememberPassword checkBox_rememberPassword = new CheckBox_RememberPassword();
    public NickNameField nickNameField = new NickNameField();
    public PasswordField passwordField = new PasswordField();
    public SubmitButton submitButton = new SubmitButton();


    @Override
    public PasswordField getPasswordField() {
        return passwordField;
    }
}
