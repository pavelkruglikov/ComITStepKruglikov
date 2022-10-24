package CW_0410_Framework;

import CW_0410_Framework.Block.WindowOfRegistration;
import CW_0410_Framework.Interface.HasCheckBox;

public class CheckBoxField extends BasePage implements HasCheckBox {

    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
