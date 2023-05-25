package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller()
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie/{id}")
    public String showMovie(@PathVariable("id") int id, Model model) {
        Movie movie = this.movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "movieDetail";

    }

    @GetMapping("/movies")
    public String showAllMovies(Model model) {
        model.addAttribute("movies", this.movieService.getAllMovies());
        return "movieList";
    }

}
