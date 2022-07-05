package mauriciomds.github.io.imdbtopmovies.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
class KitsuControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void mappingKitsuShouldReturnStatus200() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/kitsu"))
			.andExpect(MockMvcResultMatchers.status().is(200));
		
	}

}
