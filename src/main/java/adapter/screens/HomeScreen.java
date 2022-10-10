package adapter.screens;

import adapter.bases.BaseMobileScreen;
import adapter.screens.components.NavigationScreen;

public class HomeScreen extends BaseMobileScreen {

    public HomeScreen() {
        super();
    }

    public NavigationScreen navigationScreen() {
        return new NavigationScreen();
    }
}
