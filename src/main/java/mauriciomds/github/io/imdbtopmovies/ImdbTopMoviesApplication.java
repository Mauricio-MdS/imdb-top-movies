package mauriciomds.github.io.imdbtopmovies;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@SpringBootApplication
public class ImdbTopMoviesApplication {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		SpringApplication.run(ImdbTopMoviesApplication.class, args);
		
		String uri = System.getenv("IMDB_TOP_MOVIES_URI");

		HttpRequest request;
		request = HttpRequest
			.newBuilder()
			.uri(new URI(uri))
			.GET()
			.build();
	
		HttpClient client = HttpClient.newBuilder().build();
		HttpResponse<String> response =
      client.send(request, BodyHandlers.ofString());

			String json = response.body();

			JsonArray movies = JsonParser.parseString(json).getAsJsonObject().getAsJsonArray("items");
			List<String> titles = new ArrayList<>();
			List<String> urlImages = new ArrayList<>();
			List<String> ratings = new ArrayList<>();
			List<String> years = new ArrayList<>();

			for (int i = 0; i < movies.size(); i++) {
				JsonObject movie = movies.get(i).getAsJsonObject();
				titles.add(movie.get("title").getAsString());
				urlImages.add(movie.get("image").getAsString());
				ratings.add(movie.get("imDbRating").getAsString());
				years.add(movie.get("year").getAsString());
			}

			for (int i = 0; i < movies.size(); i++) {
				System.out.println(String.format("%s - %s - %s", titles.get(i), years.get(i), ratings.get(i)));
			}

	}

}