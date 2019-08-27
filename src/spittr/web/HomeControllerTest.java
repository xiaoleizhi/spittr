package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {
	
	@Test
	public void testHomePage() throws Exception{
		
		HomeController controller = new HomeController();
		//调用home()方法，并断言返回包含“home”值的String
		//Assert.assertEquals("home", controller.home());
	//	MockMvc mockMvc =  standaloneSetup(controller).build();
		//mockMvc.perform(get("/")).andExpect(view().name("home"));
		MockMvcBuilders builders = new MockMvcBuilders();
		MockMvc mockMvc = builders.standaloneSetup(controller).build();//搭建MockMvc
		//对"/"执行get请求
		ResultActions actions = mockMvc.perform(MockMvcRequestBuilders.get("/"));
		//判断结果视图名称
		actions.andExpect(MockMvcResultMatchers.view().name("home"));
		
		
	}

}
