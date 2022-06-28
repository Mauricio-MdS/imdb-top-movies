package mauriciomds.github.io.imdbtopmovies.utils;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mauriciomds.github.io.imdbtopmovies.models.Movie;

public interface MovieParserUtil {

  public static List<Movie> stringToListOfMovies(String string) {
    JsonArray arrayOfMovies = JsonParser.parseString(string).getAsJsonObject().getAsJsonArray("items");

    List<Movie> movies = new ArrayList<>();

      	for (int i = 0; i < arrayOfMovies.size(); i++) {
      		JsonObject unparsedMovie = arrayOfMovies.get(i).getAsJsonObject();
      		movies.add(new Movie(
      			unparsedMovie.get("title").getAsString(),
      			unparsedMovie.get("image").getAsString(),
      			unparsedMovie.get("imDbRating").getAsString(),
      			unparsedMovie.get("year").getAsString()
      		));
      	}
        return movies;
  }
  
}
