package adapter.screens;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;
import io.qameta.allure.Step;

public class SearchScreen extends BaseMobileScreen {

    private final MobileElement searchBar = new MobileElement(By.Id, "com.imdb.mobile:id/search_src_text", "Search bar");
    //private final MobileElement listMovies = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/recycler_search_suggestions\").childSelector(new UiSelector().resourceId(\"com.imdb.mobile:id/holder\"))", "List movies");
    private final MobileElement listMovies = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/holder\")", "List movies");

    public SearchScreen() {
        super();
    }

    @Step("Search movie")
    public void searchMovie(String movie) {
        findMobileElement(searchBar).click();
        findMobileElement(searchBar).sendKeys(movie);
        findMobileElement(listMovies).click();
    }

    @Step("Search random movie")
    public void searchRandomMovie(String movie) {
        findMobileElement(searchBar).click();
        findMobileElement(searchBar).sendKeys(movie);
        findMobileElements(listMovies).getRandomElement().click();
    }
}
