package controller.movie;

import controller.movie.model.MovieRequest;
import service.movie.MovieService;

import java.util.Scanner;

public class MovieController {
    public static void start() {
        int x = 0;
        while (x != 6) {
            x = choose();
            switch (x) {
                case 1:
                    MovieService.create(converter());
                    break;
                case 2:
                    MovieService.allMovies();
                    break;
                case 3:
                    System.out.println("Enter the movie ID : ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println(MovieService.search(id));
                    break;
                case 4:
                    System.out.println("Enter the movie ID : ");
                    int idUpdate = new Scanner(System.in).nextInt();
                    System.out.println(MovieService.update(MovieService.search(idUpdate)));
                    break;
                case 5:
                    System.out.println("Enter the movie ID : ");
                    int idDelete = new Scanner(System.in).nextInt();
                    MovieService.delete(MovieService.search(idDelete));
                    break;
            }
        }
    }

    public static int choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press`");
        System.out.println("1. Create");
        System.out.println("2. Get all");
        System.out.println("3. Get by ID");
        System.out.println("4. Update");
        System.out.println("5. Delete");
        System.out.println("6. Exit ");
        int x = 10;
        while (x < 1 || x > 6) {
            x = scanner.nextInt();
            if (x < 1 || x > 5) {
                System.out.println("You entered wrong number. Please try again");
            }
        }
        return x;
    }

    public static MovieRequest converter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the movie then genre then rating then description" +
                "(if you want) split all with ':'");
        String string = scanner.nextLine();
        return new MovieRequest(string);
    }
}
