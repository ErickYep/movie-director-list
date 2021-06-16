package service.movie;

import controller.movie.model.MovieRequest;
import exception.MovieNotFoundException;
import persistance.DataBase;
import service.movie.model.Movie;

import java.util.List;
import java.util.Scanner;

public class MovieService {
    private Movie movie;

    public static void create(MovieRequest movieRequest) {
        Movie newMovie = new Movie(movieRequest.getName(),
                movieRequest.getGenre(),
                movieRequest.getRating(),
                movieRequest.getDescription());
        DataBase.addMovie(newMovie);
    }

    public static List<Movie> allMovies() {
        System.out.println(DataBase.getMovieList().toString());
        return DataBase.getMovieList();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public static Movie search(int id) {
        for (Movie movie : DataBase.getMovieList()) {
            if (movie.getId() == id)
                return movie;
        }
        throw new MovieNotFoundException("Movie with the id - " +
                id +
                "could not be found");
    }

    public static Movie update(Movie movie) {
        int y = 0;
        while (y != 1) {
            Scanner scanner = new Scanner(System.in);
            updateMenu();
            int x = 10;
            while (x < 1 || x > 5) {
                x = scanner.nextInt();
                if (x < 1 || x > 5) {
                    System.out.println("You entered wrong number. Please try again");
                }
            }
            switch (x) {
                case 1:
                    System.out.print("Name : ");
                    movie.setName(scanner.nextLine());
                    break;
                case 2:
                    System.out.print(("Genre : "));
                    movie.setGenre(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Rating : ");
                    movie.setRating(scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Description : ");
                    movie.setDescription(scanner.nextLine());
                case 5:
                    y = 1;
                    break;
            }
        }
        return movie;
    }

    public static void delete(List<Movie> array, Movie movie) {
        array.remove(movie);
    }

    public static void delete(Movie movie) {
        delete(DataBase.getMovieList(), movie);
    }


    private static void updateMenu() {
        System.out.println("What do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Genre");
        System.out.println("3. Rating");
        System.out.println("4. Description");
        System.out.println("5. Exit");
    }
}
