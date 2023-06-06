package springMvc1_Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringAnnotation.Employee;
import springMvc1_Employee.dao.EmployeeDao;
import springMvc1_Employee.dto.EmployeeDto;

@Controller 
@RequestMapping("/")
public class EmployeeController {
	public EmployeeController() {
		System.out.println("Employee Controller");
	}
	
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
	public ModelAndView save(@ModelAttribute EmployeeDto employee) {
		ModelAndView view= new ModelAndView();
		dao.saveEmployee(employee);
		List<EmployeeDto> list = dao.getAllEmployees();
		view.addObject("employee", list);
		view.setViewName("display.jsp");
//        view.setViewName("home.jsp");
        
        return view;
	}
	

}
