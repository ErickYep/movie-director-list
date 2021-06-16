package service.director;

import controller.director.model.DirectorRequest;
import persistance.DataBase;
import service.director.model.Director;
import service.movie.model.Movie;

import java.util.List;
import java.util.Scanner;


public class DirectorService {
    public static void add(DirectorRequest director){
        Director director1 = new Director(director.getName(),director.getAge(), director.getRating(), director.getAbout());
        DataBase.addDirector(director1);
    }

    public static List<Director> allMovies(){
        System.out.println(DataBase.getDirectorList().toString());
        return DataBase.getDirectorList();
    }
    public static Director search(int id){
        for (Director director : DataBase.getDirectorList()){
            if(director.getId() == id){
                return director;
            }
        }
        return null;
    }

    public static Director update(Director director) {
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
                    director.setName(scanner.nextLine());
                    break;
                case 2:
                    System.out.print(("Age : "));
                    director.setAge(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Rating : ");
                    director.setRating(scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Description : ");
                    director.setAbout(scanner.nextLine());
                case 5:
                    y = 1;
                    break;
            }
        }
        return director;
    }
    public static void delete(List<Director> array, Director director) {
        array.remove(director);
    }

    public static void delete(Director director) {
        delete(DataBase.getDirectorList(), director);
    }

    private static void updateMenu() {
        System.out.println("What do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. Rating");
        System.out.println("4. About");
        System.out.println("5. Exit");
    }
}
