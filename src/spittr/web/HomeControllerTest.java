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
		//����home()�����������Է��ذ�����home��ֵ��String
		//Assert.assertEquals("home", controller.home());
	//	MockMvc mockMvc =  standaloneSetup(controller).build();
		//mockMvc.perform(get("/")).andExpect(view().name("home"));
		MockMvcBuilders builders = new MockMvcBuilders();
		MockMvc mockMvc = builders.standaloneSetup(controller).build();//�MockMvc
		//��"/"ִ��get����
		ResultActions actions = mockMvc.perform(MockMvcRequestBuilders.get("/"));
		//�жϽ����ͼ����
		actions.andExpect(MockMvcResultMatchers.view().name("home"));
		
		
	}

}
