package controller;

import controller.director.DirectorController;
import controller.movie.MovieController;
import service.movie.model.Movie;

import java.util.Scanner;

public class Controller {
    public static void start(){
        System.out.println("Press`");
        System.out.println("1. for actions with movies ");
        System.out.println("2. for actions with directors");
        int x = 0;
        while(x>2 || x<1) {
            x = new Scanner(System.in).nextInt();
            if(x>2 || x<1)
                System.out.println("Wrong number please try again");
        }
        switch(x){
            case 1:
                MovieController.start();
                break;
            case 2:
                DirectorController.start();
        }
    }
}
