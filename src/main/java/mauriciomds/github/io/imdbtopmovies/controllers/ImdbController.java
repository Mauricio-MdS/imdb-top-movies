package mauriciomds.github.io.imdbtopmovies.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mauriciomds.github.io.imdbtopmovies.models.Content;
import mauriciomds.github.io.imdbtopmovies.utils.ImdbParserUtil;
import mauriciomds.github.io.imdbtopmovies.utils.ImdbApiUtil;

@Controller
@RequestMapping("/imdb")
public class ImdbController {

  @GetMapping
  public String home(Model model) {
    String unparsedContent = ImdbApiUtil.getTopMovies();
    List<Content> contents = ImdbParserUtil.stringToListOfContent(unparsedContent);
    model.addAttribute("contents", contents);
    model.addAttribute("title", "Imdb Top Movies");
    return "home";
  }
  
}
