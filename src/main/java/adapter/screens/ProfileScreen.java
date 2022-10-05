package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;
import io.qameta.allure.Step;

public class ProfileScreen extends BaseMobileScreen {
    private final MobileElement movieTitleInWishList = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/your_watchlist_widget\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/recycler_view\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\").instance(0)).childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/main_line\"))", "Movie title in wish list");
    private final MobileElement movieRibbonInWishList = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/your_watchlist_widget\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/recycler_view\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\").instance(0)).childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/watchlist_ribbon\"))", "Movie title in wish list");

    public ProfileScreen() {
        super();
    }

    @Step("Get movie title in watchlist")
    public String getMovieTitleInWatchlist(){
        return findMobileElement(movieTitleInWishList).getText();
    }

    @Step("Remove movie from watchlist")
    public void removeMovieFromWatchlist(){
        findMobileElement(movieRibbonInWishList).click();
    }
}
