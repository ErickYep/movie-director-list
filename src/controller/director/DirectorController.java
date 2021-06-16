package controller.director;

import controller.director.model.DirectorRequest;
import service.director.DirectorService;

import java.util.Scanner;

public class DirectorController {
    public static void start() {
        int x = 0;
        while (x != 6) {
            x = choose();
            switch (x) {
                case 1:
                    DirectorService.add(converter());
                    break;
                case 2:
                    DirectorService.allMovies();
                    break;
                case 3:
                    System.out.println("Enter the Director ID : ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println(DirectorService.search(id));
                    break;
                case 4:
                    System.out.println("Enter the Director ID : ");
                    int idUpdate = new Scanner(System.in).nextInt();
                    System.out.println(DirectorService.update(DirectorService.search(idUpdate)));
                    break;
                case 5:
                    System.out.println("Enter the Director ID : ");
                    int idDelete = new Scanner(System.in).nextInt();
                    DirectorService.delete(DirectorService.search(idDelete));
                    break;
            }
        }
    }



    public static int choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press`");
        System.out.println("1. Add new Director");
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

    public static DirectorRequest converter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of Director then his age then rating then about" +
                "(if you want) split all with ':'");
        String string = scanner.nextLine();
        return new DirectorRequest(string);
    }

}



