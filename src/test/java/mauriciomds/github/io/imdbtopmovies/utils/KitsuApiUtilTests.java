package mauriciomds.github.io.imdbtopmovies.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KitsuApiUtilTests {

	@Test
	void getAnimesShouldReturnStringWithAnArrayOfData() {
		String animes = KitsuApiUtil.getAnimes(0);
		String testedString = animes.substring(0, 9);
		assertEquals("{\"data\":[", testedString);
	}

}
