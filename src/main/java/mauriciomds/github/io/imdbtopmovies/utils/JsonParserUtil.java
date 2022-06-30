package mauriciomds.github.io.imdbtopmovies.utils;

import java.util.List;

import mauriciomds.github.io.imdbtopmovies.exceptions.MustImplementInterfaceException;
import mauriciomds.github.io.imdbtopmovies.models.Content;

public interface JsonParserUtil {

  public static List<Content> stringToListOfContent(String string){
    throw new MustImplementInterfaceException("Must be implemented");
  }

}
