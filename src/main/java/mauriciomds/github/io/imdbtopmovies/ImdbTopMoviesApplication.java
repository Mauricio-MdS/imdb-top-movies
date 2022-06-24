package mauriciomds.github.io.imdbtopmovies;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
			
			System.out.println(response.body());
			

	}

}