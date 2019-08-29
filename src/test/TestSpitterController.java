package test;

import java.util.regex.Matcher;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.portlet.MockActionRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spittr.data.SpitterRepository;
import spittr.web.SpitterController;
import spittr.web.SpittleController;


/**
 * 测试控制器Controller的测试类
 * @author Administrator
 *
 */
public class TestSpitterController {
	/*@Test
	public void showRegistrationForm() throws Exception{
		SpitterController controller = new SpitterController();
		//构建MockMvc
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/spitter/register")).andExpect(MockMvcResultMatchers.view().name("registrationForm"));
		
	}*/

}
