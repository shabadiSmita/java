package springMvc1_Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringAnnotation.Employee;
import springMvc1_Employee.dao.EmployeeDao;

@Controller 
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView view= new ModelAndView();
		view.addObject("employee",new Employee());
		view.setViewName("register.jsp");
		return view;
		 
	}
		
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Employee employee) {
		ModelAndView view= new ModelAndView();
        dao.saveEmployee(employee);
        view.setViewName("home.jsp");
        return view;
	}
	

}
