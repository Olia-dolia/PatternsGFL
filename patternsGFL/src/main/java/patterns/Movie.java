package patterns;

import java.util.List;

public class Movie{

    private String title;
    private MovieType priceCode;
    private String country;
    private String director;
    private String description;
    private List<String> actors;

    public Movie(){}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMovieType(Movie.MovieType priceCode) {
        this.priceCode = priceCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", priceCode=" + priceCode +
                ", country='" + country + '\'' +
                ", director='" + director + '\'' +
                ", description='" + description + '\'' +
                ", actors=" + actors +
                '}';
    }

    public enum MovieType {
        REGULAR, NEW_RELEASE, CHILDREN
    }

    public String getCountry() {
        return country;
    }

    public String getDirector() {
        return director;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getActors() {
        return actors;
    }

    public MovieType getMovieType() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }
}