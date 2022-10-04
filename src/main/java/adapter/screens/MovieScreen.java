package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;

public class MovieScreen extends BaseMobileScreen {
    private final MobileElement movieDescription = new MobileElement(By.Id, "com.imdb.mobile:id/plot_overview", "Movie description");

    public MovieScreen() {
        super();
    }

    public String getMovieDescription() {
        return findMobileElement(movieDescription).getText();
    }
}
