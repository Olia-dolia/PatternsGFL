package patterns;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UI {
    private int action;
    private int checkOutput;
    private Customer customer;
    private List<Rental> rentals;
    private Rental r;
    private final Scanner scanner = new Scanner(System.in);

    public UI(){}

    public void doAction(){
        switch (action){
            case 0 -> output();
            case 1 -> getAllMovies(rentals);
            case 2 -> addMovie();
        }
    }

    private void addMovie() {
        MovieBuilder movieBuilder = new MovieBuilder();
        System.out.println("Enter: Title: ");
        movieBuilder.setTitle(scanner.nextLine());
        System.out.println("Enter: Movie Type: ");
        String s = scanner.nextLine().toLowerCase();
        for (Movie.MovieType v: Movie.MovieType.values()) {
            if(v.toString().toLowerCase().equals(s)){
                movieBuilder.setMovieType(Movie.MovieType.valueOf(v.toString()));
            }
        }
        System.out.println("Enter: Movie Country: ");
        movieBuilder.setMovieCountry(scanner.nextLine());
        System.out.println("Enter: Director: ");
        movieBuilder.setMovieDirector(scanner.nextLine());
        System.out.println("Enter: Description: ");
        movieBuilder.setDescription(scanner.nextLine());
        System.out.println("Enter: Actors: ");
        movieBuilder.setActors(Collections.singletonList(scanner.nextLine()));

        System.out.println("Enter: Days Rental: ");
        Rental r = new Rental(movieBuilder.getMovie(), scanner.nextInt());
        rentals.add(r);
        getAllMovies(rentals);
    }

    private void getAllMovies(List<Rental> rentals) {
        if(!rentals.isEmpty()){
            for (Rental r : rentals) {
                System.out.println(r);
            }
        } else System.out.println("List is Empty now!");
    }

    private void output(){
        System.out.println("Please choose: 0 - output in TERMINAL, 1 - output in HTML");
        if (scanner.nextInt() == 1) {
            writeInHTML(customer);
        } else {
            terminalOutput(customer);
        }
    }

    private void writeInHTML(Customer customer){
        //File f = new File("output");
        System.out.println("Output in HTML");
    }
    private void terminalOutput(Customer customer){
        System.out.println(customer.statement());
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getCheckOutput() {
        return checkOutput;
    }

    public void setCheckOutput(int checkOutput) {
        this.checkOutput = checkOutput;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public Rental getR() {
        return r;
    }

    public void setR(Rental r) {
        this.r = r;
    }
}
