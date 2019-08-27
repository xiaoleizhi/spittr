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
	 * ��һ������·��ӳ �䵽DispatcherServlet�ϡ��ڱ����У���ӳ����ǡ�/�������ʾ
	 * ������Ӧ�õ�Ĭ��Servlet�����ᴦ�����Ӧ�õ���������
	 */
	//ָ��������
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
	//��DispatcherServletӳ�䵽��/��
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
