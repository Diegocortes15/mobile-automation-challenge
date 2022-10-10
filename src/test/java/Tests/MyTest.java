package Tests;

import adapter.bases.BaseMobileTest;
import adapter.utils.Movies;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest() {
        homeScreen = loginScreen.skipSignIn();
        navigationScreen = homeScreen.navigationScreen();
        searchScreen = navigationScreen.goToSearchOption();
        movieScreen = searchScreen.searchMovie(Movies.INTERSTELLAR.getMovieName());
        Assert.assertTrue(movieScreen.getMovieDescription().contains("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."));
    }

    @Test(priority = 2)
    public void verifyWatchlistTest() {
        homeScreen = loginScreen.singInWithGoogle();
        navigationScreen = homeScreen.navigationScreen();
        searchScreen = navigationScreen.goToSearchOption();
        movieScreen = searchScreen.searchRandomMovie(Movies.PASSENGERS.getMovieName());
        String movieTitle = movieScreen.getMovieTitle();
        movieScreen.addToWatchList();
        navigationScreen = movieScreen.navigationScreen();
        profileScreen = navigationScreen.goToProfileOption();
        String movieTitleExpected = profileScreen.getMovieTitleInWatchlist();
        Assert.assertEquals(movieTitle, movieTitleExpected);
        profileScreen.removeMovieFromWatchlist();
    }

    @Test(priority = 3)
    public void rateMovieTest() {
        homeScreen = loginScreen.singInWithGoogle();
        navigationScreen = homeScreen.navigationScreen();
        searchScreen = navigationScreen.goToSearchOption();
        movieScreen = searchScreen.searchMovie(Movies.INTERSTELLAR.getMovieName());
        movieScreen.scrollToUserReviews();
        rateMovieScreen = movieScreen.clickReviewsSectionEmptyRateButton();
        movieScreen = rateMovieScreen.setMovieRating(Movies.INTERSTELLAR.getMovieRating());
        movieScreen.scrollToUserReviews();
        Assert.assertTrue(movieScreen.isReviewsSectionRateButtonDisplayed());

        rateMovieScreen = movieScreen.clickReviewsSectionRateButton();
        movieScreen = rateMovieScreen.clickRemoveMovieRating();
        movieScreen.scrollToUserReviews();
        Assert.assertTrue(movieScreen.isReviewsSectionEmptyRateButtonDisplayed());
    }
}


