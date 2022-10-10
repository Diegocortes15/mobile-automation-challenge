package adapter.bases;


import adapter.screens.*;
import adapter.screens.components.NavigationScreen;
import core.ConfigCapabilities;
import core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;


public class BaseMobileTest {
    public AndroidDriver<AndroidElement> driver;
    public NavigationScreen navigationScreen;
    public HomeScreen homeScreen;
    public LoginScreen loginScreen;
    public SearchScreen searchScreen;
    public MovieScreen movieScreen;
    public ProfileScreen profileScreen;
    public RateMovieScreen rateMovieScreen;

    @BeforeMethod(alwaysRun = true)
    public void SetUp() {
        if (driver == null) {
            this.driver = MobileAppDriver.getMoviesAppDriver(ConfigCapabilities.getCapabilities());
            this.homeScreen = new HomeScreen();
            this.navigationScreen = new NavigationScreen();
            this.loginScreen = new LoginScreen();
            this.searchScreen = new SearchScreen();
            this.movieScreen = new MovieScreen();
            this.profileScreen = new ProfileScreen();
            this.rateMovieScreen = new RateMovieScreen();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void TearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
            // driver.close();
        }
    }
}



