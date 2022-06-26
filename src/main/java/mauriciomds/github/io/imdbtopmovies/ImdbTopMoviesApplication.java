package mauriciomds.github.io.imdbtopmovies;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mauriciomds.github.io.imdbtopmovies.models.Movie;
import mauriciomds.github.io.imdbtopmovies.utils.ImdbUtils;

@SpringBootApplication
public class ImdbTopMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbTopMoviesApplication.class, args);
		
		List<Movie> movies = ImdbUtils.getTopMovies();

			for (int i = 0; i < movies.size(); i++) {
				System.out.println(movies.get(i).toString());
			}

	}

}