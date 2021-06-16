package service.movie.model;

public class Movie {
    private String name;
    private long id = 11524876;
    private double rating;
    private String description;
    private String genre;

    public Movie(String name,String genre, double rating, String description) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
        this.id = id + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Override
    public String toString() {
        StringBuilder  str = new StringBuilder("Name : ");

        str.append(name).append("\nGenre : ").append(genre)
                .append("\nRating : ").append(rating)
                .append("\nDescription : ").append(description)
                .append("\nID : ").append(id);

        return str.toString();
    }
}
