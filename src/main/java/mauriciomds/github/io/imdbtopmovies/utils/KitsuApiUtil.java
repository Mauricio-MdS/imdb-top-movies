package mauriciomds.github.io.imdbtopmovies.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import mauriciomds.github.io.imdbtopmovies.exceptions.ApiConnectionException;

public interface KitsuApiUtil {

  public static final String URI = "https://kitsu.io/api/edge/anime?sort=ratingRank&page[limit]=20&page[offset]=";

  public static String getAnimes(int page){

    HttpClient client = HttpClient.newBuilder().build();

    try {
      HttpRequest request = HttpRequest
        .newBuilder()
        .uri(new URI(URI + page))
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
