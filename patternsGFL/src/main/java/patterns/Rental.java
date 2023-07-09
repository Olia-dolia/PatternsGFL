package patterns;

public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "movie=" + movie.toString() +
                ", daysRented=" + daysRented +
                '}';
    }
}
