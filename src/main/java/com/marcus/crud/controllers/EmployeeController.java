package com.marcus.crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcus.crud.models.Employee;
import com.marcus.crud.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public String getCountries(Model model) {		
		List<Employee> employeeList = employeeService.getEmployees();	
		model.addAttribute("employees", employeeList);	
		return "employee";
	}	
	
	@PostMapping("/employees/addNew")
	public String addNew(Employee employee) {
		if(!(employee.getSex().equals("SELECT")) && !(employee.getActive().equals("SELECT"))) {
			employeeService.save(employee);
		}else {
			return "redirect:/employees";
		}
		return "redirect:/employees";
	}
	
	@RequestMapping("employees/findById")
	@ResponseBody
	public Optional<Employee> findById(int id) {
	  return employeeService.findById(id);	
	}	
	
	@RequestMapping(value="/employees/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employee country) {
		employeeService.save(country);
		return "redirect:/employees";
	}
	
	@RequestMapping(value="/employees/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}
	
}
