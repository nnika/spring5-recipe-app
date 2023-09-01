package guru.springframework.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {IndexController.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class IndexControllerTest {
	@Autowired
	private IndexController indexController;

	/**
	 * Method under test: {@link IndexController#getIndexPage()}
	 */
	@Test
	public void testGetIndexPage() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
		MockMvcBuilders.standaloneSetup(indexController)
				.build()
				.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.model().size(0))
				.andExpect(MockMvcResultMatchers.view().name("index"))
				.andExpect(MockMvcResultMatchers.forwardedUrl("index"));
	}

	/**
	 * Method under test: {@link IndexController#getIndexPage()}
	 */
	@Test
	public void testGetIndexPage2() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/", "Uri Vars");
		MockMvcBuilders.standaloneSetup(indexController)
				.build()
				.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.model().size(0))
				.andExpect(MockMvcResultMatchers.view().name("index"))
				.andExpect(MockMvcResultMatchers.forwardedUrl("index"));
	}
}

