package patterns;

import java.util.List;

import static patterns.Movie.MovieType.*;

public class Main {

    public static void main(String[] args) {
        List<Rental> rentals = List.of(new Rental(new MovieBuilder().setTitle("Harry Potter")
                                                                    .setMovieType(CHILDREN)
                                                                    .setMovieCountry("UK")
                                                                    .getMovie(), 5),
                                        new Rental(new MovieBuilder().setTitle("Lord of the Rings")
                                                .setMovieType(NEW_RELEASE)
                                                .setMovieCountry("USA")
                                                .getMovie(), 4));

        /*List<Rental> rentals = List.of(new Rental(new Movie("Rambo", REGULAR), 1),
                new Rental(new Movie("Lord of the Rings", NEW_RELEASE), 4),
                new Rental(new Movie("Harry Potter", CHILDREN), 5));*/

        Customer customer = new Customer("John Doe", rentals);
        String statement = customer.statement();

        System.out.println(statement);
    }
}
