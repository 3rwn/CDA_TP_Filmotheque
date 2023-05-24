package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.service.MovieService;
import fr.eni.movielibrary.bo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("movieBean")
public class MovieController {

    @Autowired
    private MovieService movieService;

    public Movie findMovie(int id) {
        return movieService.getMovieById(id);
    }

    public List<Movie> showAllMovies() {
        return movieService.getAllMovies();
    }

}
