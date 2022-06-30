package mauriciomds.github.io.imdbtopmovies.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mauriciomds.github.io.imdbtopmovies.models.Content;
import mauriciomds.github.io.imdbtopmovies.utils.MarvelParserUtil;
import mauriciomds.github.io.imdbtopmovies.utils.MarvelUtil;

@Controller
@RequestMapping("/marvel")
public class MarvelController {

  @GetMapping
  public String home(Model model) {
    String unparsedContent = MarvelUtil.getSeries();
    List<Content> contents = MarvelParserUtil.stringToListOfContent(unparsedContent);
    model.addAttribute("contents", contents);
    model.addAttribute("title", "Marvel Series");
    return "home";
  }
  
}
