package adapter.utils;

public enum Movies {
    INTERSTELLAR("Interstellar", 9),
    PASSENGERS("Passengers", 8);

    private final String movieName;
    private final int movieRating;

    Movies(String movieName, int movieRating) {
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }
}
