package patterns;

import java.util.List;

public class MovieBuilder implements Builder {

    private String title;
    private Movie.MovieType priceCode;
    private String country;
    private String director;
    private String description;
    private List<String> actors;


    @Override
    public MovieBuilder setTitle(String t) {
        title = t;
        return this;
    }

    @Override
    public MovieBuilder setMovieType(Movie.MovieType p) {
        priceCode = p;
        return this;
    }
    @Override
    public MovieBuilder setMovieCountry(String c) {
        country = c;
        return this;
    }

    @Override
    public MovieBuilder setMovieDirector(String dr) {
        director = dr;
        return this;
    }

    @Override
    public MovieBuilder setDescription(String ds) {
        description = ds;
        return this;
    }

    @Override
    public MovieBuilder setActors(List<String> a) {
        actors = a;
        return this;
    }


    public Movie getMovie() {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setMovieType(priceCode);
        movie.setCountry(country);
        movie.setDirector(director);
        movie.setDescription(description);
        movie.setDescription(description);
        movie.setActors(actors);
        return movie;
    }
}
