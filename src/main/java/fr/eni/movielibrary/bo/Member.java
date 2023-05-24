package fr.eni.movielibrary.bo;

import java.util.List;

public class Member {
    private long id;
    private String lastName;
    private String firstName;
    private String login;
    private String password;
    private boolean isAdmin;
    private List<Opinion> opinion;

    public Member(long id, String lastName, String firstName, String login, String password, boolean isAdmin, List<Opinion> opinion) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.opinion = opinion;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Opinion> getOpinion() {
        return opinion;
    }

    public void setOpinion(List<Opinion> opinion) {
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", opinion=" + opinion +
                '}';
    }
}
