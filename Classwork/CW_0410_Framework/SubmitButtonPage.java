package CW_0410_Framework;

import CW_0410_Framework.Block.WindowOfRegistration;
import CW_0410_Framework.Interface.HasSubmitButton;

public class SubmitButtonPage extends BasePage implements HasSubmitButton {
    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
