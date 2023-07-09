package patterns;

import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        List<Rental> rentals = List.of(new Rental(new MovieBuilder().setTitle("Harry Potter")
                        .setMovieType(Movie.MovieType.REGULAR)
                        .setMovieCountry("UK")
                        .getMovie(), 5),
                new Rental(new MovieBuilder().setTitle("Lord of the Rings")
                        .setMovieType(Movie.MovieType.NEW_RELEASE)
                        .getMovie(), 4));
        Customer customer = new Customer("John Doe", rentals);

        Scanner sc = new Scanner(System.in);
        UI ui = new UI();
        String text = """
               0 - output
               1 - see movies list
               2 - add movie
                """;
        System.out.println("Please choose action: " + text);

        ui.setAction(sc.nextInt());
        ui.setCustomer(customer);
        ui.setRentals(rentals);
        ui.doAction();
    }
}
