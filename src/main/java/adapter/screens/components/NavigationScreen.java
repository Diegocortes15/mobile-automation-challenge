package adapter.screens.components;

import adapter.bases.BaseMobileScreen;
import core.By;
import core.MobileElement;
import io.qameta.allure.Step;

public class NavigationScreen extends BaseMobileScreen {

    private final MobileElement homeIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_home", "Home icon button");
    private final MobileElement searchIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_search_browse", "Search icon");
    private final MobileElement videoIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_video", "Video icon button");
    private final MobileElement profileIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_you", "Profile icon button");

    public NavigationScreen() {
        super();
    }

    public void goToHomeOption() {
        findMobileElement(homeIcon).click();
    }

    @Step("Go to search option")
    public void goToSearchOption() {
        findMobileElement(searchIcon).click();
    }

    public void goToVideoOption() {
        findMobileElement(videoIcon).click();
    }

    @Step("Go to profile option")
    public void goToProfileOption() {
        findMobileElement(profileIcon).click();
    }

}
