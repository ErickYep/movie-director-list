package persistance;



import service.director.model.Director;
import service.movie.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static List<Movie> movieList = new ArrayList<>();
    private static List<Director> directorList = new ArrayList<>();


    public static List<Movie> getMovieList() {
        return movieList;
    }

    public static List<Director> getDirectorList() {
        return directorList;
    }

    public static void addMovie(Movie movie){

        getMovieList().add(movie);
    }

    public static void addDirector(Director director){

        getDirectorList().add(director);
    }

}
