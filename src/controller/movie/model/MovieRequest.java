package controller.movie.model;

public class MovieRequest {

    private String name;
    private String genre;
    private double rating;
    private String description;

    public MovieRequest(String string) {
        String[] strings = string.split(":");
        name = strings[0];
        genre = strings[1];
        rating = Double.parseDouble(strings[2]);
        description = strings[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
