package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;

public class SearchScreen extends BaseMobileScreen {

    private final MobileElement searchBar = new MobileElement(By.Id, "com.imdb.mobile:id/search_src_text", "Search bar");
    private final MobileElement firstMovie = new MobileElement(By.Id, "com.imdb.mobile:id/holder", "First Movie");

    public SearchScreen() {
        super();
    }

    public void searchMovie(String movie) {
        findMobileElement(searchBar).click();
        findMobileElement(searchBar).sendKeys(movie);
        findMobileElement(firstMovie).click();
    }
}
