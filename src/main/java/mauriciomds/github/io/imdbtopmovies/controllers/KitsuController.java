package mauriciomds.github.io.imdbtopmovies.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mauriciomds.github.io.imdbtopmovies.models.Content;
import mauriciomds.github.io.imdbtopmovies.utils.KitsuApiUtil;
import mauriciomds.github.io.imdbtopmovies.utils.KitsuParserUtil;

@Controller
@RequestMapping("/kitsu")
public class KitsuController {

  @GetMapping
  public String home(Model model) {
    List<Content> contents = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      String unparsedContent = KitsuApiUtil.getAnimes(i);
      contents.addAll(KitsuParserUtil.stringToListOfContent(unparsedContent));
    }
    model.addAttribute("contents", contents);
    model.addAttribute("title", "Kitsu Top Animes");
    return "home";
  }
  
}
