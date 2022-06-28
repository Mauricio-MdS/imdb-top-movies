package mauriciomds.github.io.imdbtopmovies.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mauriciomds.github.io.imdbtopmovies.models.Movie;
import mauriciomds.github.io.imdbtopmovies.utils.ImdbUtil;

@Controller
@RequestMapping("/**")
public class HomeController {

  @GetMapping
  public String home(Model model) {
    List<Movie> movies = ImdbUtil.getTopMovies();
    model.addAttribute("movies", movies);
    return "home";
  }
  
}
