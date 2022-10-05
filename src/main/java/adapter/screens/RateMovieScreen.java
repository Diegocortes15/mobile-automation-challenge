package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;

public class RateMovieScreen extends BaseMobileScreen {

    private final MobileElement rateButton = new MobileElement(By.Id, "com.imdb.mobile:id/rate_title_button", "Rate movie button");
    private final MobileElement removeRatingButton = new MobileElement(By.Id, "com.imdb.mobile:id/remove_rating", "Rate movie button");
    public MobileElement ratingMovie;

    public RateMovieScreen() {
        super();
    }

    public void setRatingMovie(int rating) {
        this.ratingMovie = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/star_row\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/star_" + rating + "\"))", "Rating movie");
        findMobileElement(ratingMovie).click();
        findMobileElement(rateButton).click();
    }

    public void clickRemoveMovieRating(){
        findMobileElement(removeRatingButton).click();
    }
}
