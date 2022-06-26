package mauriciomds.github.io.imdbtopmovies.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import mauriciomds.github.io.imdbtopmovies.exceptions.ImdbConnectionException;
import mauriciomds.github.io.imdbtopmovies.models.Movie;

public interface ImdbUtils {

  public static List<Movie> getTopMovies(){

    String key = System.getenv("IMDB_KEY");
    HttpClient client = HttpClient.newBuilder().build();

		List<Movie> movies;
    try {
      HttpRequest request = HttpRequest
      	.newBuilder()
      	.uri(new URI("https://imdb-api.com/en/API/Top250Movies/" + key))
      	.GET()
      	.build();

      HttpResponse<String> response =
        client.send(request, BodyHandlers.ofString());

      	String json = response.body();

      	JsonArray arrayOfMovies = JsonParser.parseString(json).getAsJsonObject().getAsJsonArray("items");

      	movies = new ArrayList<>();

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
    } catch (JsonSyntaxException | URISyntaxException | IOException | InterruptedException e) {
      throw new ImdbConnectionException(e);
    }    
  }

}
