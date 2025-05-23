package org.lesson.java.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.lesson.java.best_of_the_year.model.Movie;
import org.lesson.java.best_of_the_year.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(Model model) {
        model.addAttribute("person", "Francesco");
        return "home";
    }

    @GetMapping("/movies")
    public String getBestMovies(Model model) {
        List<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/songs")
    public String getBestSongs(Model model) {
        List<Song> songs = getBestSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }

    public List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Il Gladiatore"));
        movies.add(new Movie(2, "Il Signore degli Anelli"));
        movies.add(new Movie(3, "Il Padrino"));
        movies.add(new Movie(4, "Il Cavaliere Oscuro"));
        return movies;
    }

    public List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Don't look back in anger"));
        songs.add(new Song(2, "Supersonic"));
        songs.add(new Song(3, "Champagne Supernova"));
        return songs;
    }

    @GetMapping("/movies/{id}")
    public String getMovieById(Model model, @PathVariable Integer id) {
        for (Movie movie : getBestMovies()) {
            if (movie.getId() == id) {
                model.addAttribute("product", movie);
            }
        }
        return "show";
    }

    @GetMapping("/songs/{id}")
    public String getSongById(Model model, @PathVariable Integer id) {
        for (Song song : getBestSongs()) {
            if (song.getId() == id) {
                model.addAttribute("product", song);
            }
        }
        return "show";
    }
}
