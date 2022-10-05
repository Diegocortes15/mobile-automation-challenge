package adapter.bases;


import adapter.screens.*;
import adapter.screens.components.NavigationScreen;
import core.ConfigCapabilities;
import core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;


public class BaseMobileTest {
    private AndroidDriver<AndroidElement> driver;
    public NavigationScreen navigationScreen;
    public LoginScreen loginScreen;
    public SearchScreen searchScreen;
    public MovieScreen movieScreen;
    public ProfileScreen profileScreen;
    public RateMovieScreen rateMovieScreen;

    @BeforeSuite(alwaysRun = true)
    public void SetUp() {
        driver = MobileAppDriver.getMoviesAppDriver(ConfigCapabilities.getCapabilities());
        navigationScreen = new NavigationScreen();
        loginScreen = new LoginScreen();
        searchScreen = new SearchScreen();
        movieScreen = new MovieScreen();
        profileScreen = new ProfileScreen();
        rateMovieScreen = new RateMovieScreen();
    }

    @AfterSuite(alwaysRun = true)
    public void TearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



