package adapter.screens;

import adapter.bases.BaseMobileScreen;
import adapter.screens.components.NavigationScreen;
import core.By;
import core.MobileElement;

public class LoginScreen extends BaseMobileScreen {
    private final MobileElement notNowButton = new MobileElement(By.Id, "com.imdb.mobile:id/splash_not_now", "Not now button");
    private final MobileElement logInWithGoogleButton = new MobileElement(By.Id, "com.imdb.mobile:id/google_oauth", "LogIn with Google button");
    private final MobileElement firstGoogleAccount = new MobileElement(By.Id, "android:id/text1", "First Google account");
    private final MobileElement submitGoogleAccountSelectedButton = new MobileElement(By.Id, "android:id/button1", "Submit Google account selected button");


    public LoginScreen() {
        super();
    }

    public void skipSignIn() {
        findMobileElement(notNowButton).click();
    }

    public void singInWithGoogle() {
        findMobileElement(logInWithGoogleButton).click();
        findMobileElement(firstGoogleAccount).click();
        findMobileElement(submitGoogleAccountSelectedButton).click();
    }
}
