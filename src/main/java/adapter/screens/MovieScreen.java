package adapter.screens;

import adapter.bases.BaseMobileScreen;
import adapter.screens.components.NavigationScreen;
import core.By;
import core.MobileElement;
import io.qameta.allure.Step;

public class MovieScreen extends BaseMobileScreen {
    private final MobileElement movieDescription = new MobileElement(By.Id, "com.imdb.mobile:id/plot_overview", "Movie description");
    private final MobileElement movieTitle = new MobileElement(By.AndroidUiSelector, "UiSelector().resourceId(\"com.imdb.mobile:id/title_header\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/title\"))", "Movie title");
    private final MobileElement addToWatchListButton = new MobileElement(By.AndroidUiSelector, "UiSelector().resourceId(\"com.imdb.mobile:id/watchlist_button_view\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/state_off\"))", "Add to watch list button");
    private final MobileElement userReviewsSection = new MobileElement(By.Id, "com.imdb.mobile:id/title_user_reviews", "User reviews");
    private final MobileElement reviewsSectionEmptyRateButton = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/title_user_reviews\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/empty_user_rating\"))", "User reviews button");
    private final MobileElement reviewsSectionRateButton = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/title_user_reviews\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/user_rating\"))", "User reviews button");

    public MovieScreen() {
        super();
    }

    @Step("Get movie description")
    public String getMovieDescription() {
        return findMobileElement(movieDescription).getText();
    }

    @Step("Get movie title")
    public String getMovieTitle() {
        return findMobileElement(movieTitle).getText();
    }

    @Step("Add movie to watchlist")
    public void addToWatchList() {
        findMobileElement(addToWatchListButton).click();
    }

    @Step("Scroll to user reviews section")
    public void scrollToUserReviews() {
        scrollTo(userReviewsSection);
    }

    @Step("Click on empty rate button")
    public RateMovieScreen clickReviewsSectionEmptyRateButton() {
        findMobileElement(reviewsSectionEmptyRateButton).click();
        return new RateMovieScreen();
    }

    @Step("Verify if rate button is displayed")
    public boolean isReviewsSectionRateButtonDisplayed() {
        return findMobileElement(reviewsSectionRateButton).isDisplayed();
    }

    @Step("Click on rate button")
    public RateMovieScreen clickReviewsSectionRateButton() {
        findMobileElement(reviewsSectionRateButton).click();
        return new RateMovieScreen();
    }

    @Step("Verify if empty rate button is displayed")
    public boolean isReviewsSectionEmptyRateButtonDisplayed() {
        return findMobileElement(reviewsSectionEmptyRateButton).isDisplayed();
    }

    public NavigationScreen navigationScreen() {
        return new NavigationScreen();
    }
}
