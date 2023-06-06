package springMvc1_Employee.Config;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@EnableWebMvc
public class WebIntilizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return new Class[] {EmployeeCongifg.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {EmployeeCongifg.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
