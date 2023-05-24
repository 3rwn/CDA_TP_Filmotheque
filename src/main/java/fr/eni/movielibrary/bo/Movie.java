package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {
    private long id;
    private String title;
    private int year;
    private int duration;
    private String synopsis;
    private Participant director;
    private List<Participant> actor;
    private List<Opinion> opinion;
}
