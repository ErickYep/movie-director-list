package service.director.model;

public class Director {
    private String name;
    private int age;
    private double rating;
    private String about;
    private static int id ;

    public Director(String name, int age, double rating, String about) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.about = about;
        setId(id+1);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Director \n" +
                "name : " + name + '\n' +
                " age : " + age + '\n' +
                " rating : " + rating + "\n" +
                " about : " + about + '\n' +
                " id : " + id +"\n";
    }
}
