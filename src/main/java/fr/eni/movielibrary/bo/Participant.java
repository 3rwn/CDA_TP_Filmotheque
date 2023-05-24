package fr.eni.movielibrary.bo;

import java.util.List;

public class Participant {
    private long id;
    private String lastName;
    private String firstName;
    private List<Movie> movies;

    public Participant(long id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public Participant(long id, String lastName, String firstName, List<Movie> movies) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.movies = movies;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", movies=" + movies +
                '}';
    }
}
