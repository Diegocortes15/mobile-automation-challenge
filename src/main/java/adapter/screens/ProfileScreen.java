package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;

public class ProfileScreen extends BaseMobileScreen {

    //private final String watchListWidget = "new UiSelector().resourceId(\"com.imdb.mobile:id/your_watchlist_widget\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/recycler_view\"))";
    private final MobileElement watchListWidget = new MobileElement(By.AndroidUiSelector,"new UiSelector().resourceId(\"com.imdb.mobile:id/your_watchlist_widget\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/recycler_view\"))","");
    private final MobileElement movieTitleInWishList = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/your_watchlist_widget\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/recycler_view\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\").instance(0)).childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/main_line\"))", "Movie title in wish list");
    private final MobileElement movieRibbonInWishList = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/your_watchlist_widget\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/recycler_view\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\").instance(0)).childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/watchlist_ribbon\"))", "Movie title in wish list");

    public ProfileScreen() {
        super();
    }

    public void scrollToWatchListWidget() {
        scrollTo(watchListWidget.element);
    }

    public String getMovieTitleInWishList(){
        return findMobileElement(movieTitleInWishList).getText();
    }

    public void removeMovieFromWishList(){
        findMobileElement(movieRibbonInWishList).click();
    }
}
