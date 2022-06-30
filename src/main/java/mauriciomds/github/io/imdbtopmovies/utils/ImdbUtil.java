package mauriciomds.github.io.imdbtopmovies.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import mauriciomds.github.io.imdbtopmovies.exceptions.ApiConnectionException;

public interface ImdbUtil {

  public static String getTopMovies(){

    String key = System.getenv("IMDB_KEY");
    HttpClient client = HttpClient.newBuilder().build();

    try {
      HttpRequest request = HttpRequest
      	.newBuilder()
      	.uri(new URI("https://imdb-api.com/en/API/Top250Movies/" + key))
      	.GET()
      	.build();

      HttpResponse<String> response =
        client.send(request, BodyHandlers.ofString());

        return response.body();

    } catch ( URISyntaxException | IOException | InterruptedException e) {
      throw new ApiConnectionException(e);
    }    
  }

}
