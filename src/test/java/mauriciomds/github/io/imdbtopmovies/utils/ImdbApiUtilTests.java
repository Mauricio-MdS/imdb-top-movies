package mauriciomds.github.io.imdbtopmovies.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ImdbApiUtilTests {

	@Test
	void getTopMoviesShouldReturnStringWithAnArrayOfItems() {
		String topMovies = ImdbApiUtil.getTopMovies();
		String testedString = topMovies.substring(0, 10);
		assertEquals("{\"items\":[", testedString);
	}

}
