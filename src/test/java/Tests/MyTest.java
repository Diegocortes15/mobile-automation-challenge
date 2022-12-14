package Tests;

import adapter.bases.BaseMobileTest;
import adapter.utils.Movies;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest() {
        loginScreen.skipSignIn();
        navigationScreen.goToSearchOption();
        searchScreen.searchMovie(Movies.INTERSTELLAR.getMovieName());
        Assert.assertTrue(movieScreen.getMovieDescription().contains("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."));
    }

    @Test(priority = 2)
    public void verifyWatchlistTest() {
        loginScreen.singInWithGoogle();
        navigationScreen.goToSearchOption();
        searchScreen.searchRandomMovie(Movies.PASSENGERS.getMovieName());
        String movieTitle = movieScreen.getMovieTitle();
        movieScreen.addToWatchList();
        navigationScreen.goToProfileOption();
        Assert.assertEquals(movieTitle, profileScreen.getMovieTitleInWatchlist());
        profileScreen.removeMovieFromWatchlist();
    }

    @Test(priority = 3)
    public void rateMovieTest() {
        loginScreen.singInWithGoogle();
        navigationScreen.goToSearchOption();
        searchScreen.searchMovie(Movies.INTERSTELLAR.getMovieName());
        movieScreen.scrollToUserReviews();
        movieScreen.clickReviewsSectionEmptyRateButton();
        rateMovieScreen.setMovieRating(Movies.INTERSTELLAR.getMovieRating());
        movieScreen.scrollToUserReviews();
        Assert.assertTrue(movieScreen.isReviewsSectionRateButtonDisplayed());

        movieScreen.clickReviewsSectionRateButton();
        rateMovieScreen.clickRemoveMovieRating();
        movieScreen.scrollToUserReviews();
        Assert.assertTrue(movieScreen.isReviewsSectionEmptyRateButtonDisplayed());
    }
}


