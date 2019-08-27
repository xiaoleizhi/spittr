package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}
	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
	 * 将一个或多个路径映 射到DispatcherServlet上。在本例中，它映射的是“/”，这表示
	 * 它会是应用的默认Servlet。它会处理进入应用的所有请求。
	 */
	//指定配置类
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.support.AbstractDispatcherServletInitializer
	 * #getServletMappings() 
	 * 
	 */
	//将DispatcherServlet映射到“/”
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
