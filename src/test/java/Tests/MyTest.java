package Tests;

import adapter.bases.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseMobileTest {

    @Test
    public void searchMovieTest() {
        loginScreen.skipSignIn();
        navigationScreen.goToSearchOption();
        searchScreen.searchMovie("Interstellar");
        Assert.assertTrue(movieScreen.getMovieDescription().contains("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."));
    }
}


