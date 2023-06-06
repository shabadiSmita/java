package springMvc_Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import spring_Employee.dao.EmployeeDao;
import spring_Employee.dto.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping
	public ModelAndView register() {
		ModelAndView view=new ModelAndView();
		view.addObject("employee",new Employee());
	    view.setViewName("register.jsp");
	    return view;
	}
	
	
	
	

}

