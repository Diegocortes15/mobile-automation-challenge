package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;

public class MovieScreen extends BaseMobileScreen {
    private final MobileElement movieDescription = new MobileElement(By.Id, "com.imdb.mobile:id/plot_overview", "Movie description");
    private final MobileElement movieTitle = new MobileElement(By.Id, "com.imdb.mobile:id/title", "Movie title");
    private final MobileElement addToWatchListButton = new MobileElement(By.Id, "com.imdb.mobile:id/state_off", "Add to watch list button");

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
}
