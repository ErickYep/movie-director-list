package controller.director.model;

public class DirectorRequest {
    private String name;
    private int age;
    private double rating;
    private String about;

    public DirectorRequest(String request) {
        String[] strings = request.split(":");
        this.name = strings[0];
        this.age = Integer.parseInt(strings[1]);
        this.rating = Double.parseDouble(strings[2]);
        this.about = strings[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
