package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;

public class MovieScreen extends BaseMobileScreen {
    private final MobileElement movieDescription = new MobileElement(By.Id, "com.imdb.mobile:id/plot_overview", "Movie description");
    private final MobileElement movieTitle = new MobileElement(By.Id, "com.imdb.mobile:id/title", "Movie title");
    private final MobileElement addToWatchListButton = new MobileElement(By.Id, "com.imdb.mobile:id/state_off", "Add to watch list button");
    private final MobileElement userReviewsSection = new MobileElement(By.Id, "com.imdb.mobile:id/title_user_reviews", "User reviews");
    private final MobileElement reviewsSectionEmptyRateButton = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/title_user_reviews\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/empty_user_rating\"))", "User reviews button");
    private final MobileElement reviewsSectionRateButton = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/title_user_reviews\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/user_rating\"))", "User reviews button");

    public MovieScreen() {
        super();
    }

    public String getMovieDescription() {
        return findMobileElement(movieDescription).getText();
    }

    public String getMovieTitle() {
        return findMobileElement(movieTitle).getText();
    }

    public void addToWatchList() {
        findMobileElement(addToWatchListButton).click();
    }

    public void scrollToUserReviews() {
        scrollTo(userReviewsSection);
    }

    public void clickReviewsSectionEmptyRateButton() {
        findMobileElement(reviewsSectionEmptyRateButton).click();
    }

    public boolean isReviewsSectionRateButtonDisplayed()
    {
        return findMobileElement(reviewsSectionRateButton).isDisplayed();
    }

    public void clickReviewsSectionRateButton() {
        findMobileElement(reviewsSectionRateButton).click();
    }

    public boolean isReviewsSectionEmptyRateButtonDisplayed()
    {
        return findMobileElement(reviewsSectionEmptyRateButton).isDisplayed();
    }
}
