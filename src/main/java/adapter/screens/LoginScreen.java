package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;

public class LoginScreen extends BaseMobileScreen {
    private final MobileElement notNowButton = new MobileElement(By.Id, "com.imdb.mobile:id/splash_not_now", "Not now button");

    public LoginScreen()  {
        super();
    }

    public void skipSignIn() {
        findMobileElement(notNowButton).click();
    }
}
