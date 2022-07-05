package mauriciomds.github.io.imdbtopmovies.utils;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

import mauriciomds.github.io.imdbtopmovies.exceptions.MustImplementInterfaceException;

class JsonParserUtilTests {

	@Test
	void jsonParserShouldAlwaysThrowException() {
		
		assertThrowsExactly(MustImplementInterfaceException.class, () -> JsonParserUtil.stringToListOfContent("string"));
	}

}
