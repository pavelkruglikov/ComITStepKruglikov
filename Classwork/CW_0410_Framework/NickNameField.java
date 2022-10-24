package CW_0410_Framework;

import CW_0410_Framework.Block.WindowOfRegistration;
import CW_0410_Framework.Interface.HasNickName;

public class NickNameField extends BasePage implements HasNickName {


    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
