package patterns;

import java.util.List;

public interface Builder {
    MovieBuilder setTitle(String title);
    MovieBuilder setMovieType(Movie.MovieType type);
    MovieBuilder setMovieCountry(String country);
    MovieBuilder setMovieDirector(String director);
    MovieBuilder setDescription(String description);
    MovieBuilder setActors(List<String> actors);
}
