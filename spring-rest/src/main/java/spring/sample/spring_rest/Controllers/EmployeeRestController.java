package spring.sample.spring_rest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import spring.sample.spring_rest.Model.Emp;
import spring.sample.spring_rest.Service.EmployeeServiceImpl;


/**
 * 
 * 1. WHy error handling coming in swagger
 * 2. ApiInfo NOt working
 * 3. Another controller creation
 */

@RestController
@RequestMapping("/v1")
@ApiResponses(
		value={
				@ApiResponse(code=600, message="600 is the message"),
				@ApiResponse(code=700, message="700 is the message")
		}
)
@Api(value="Sample Employee Rest Controller", description="Description of Employee Rest Controller")
public class EmployeeRestController
{
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@ApiOperation("Welcome Endpoint")
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String welcomeMessage() {
	    return "<h2>Welcome User</h2>";
	}
	
	@ApiOperation("Get all Employees")
	@ApiResponses(
			value={
					@ApiResponse(code=300, message="300 is the message"),
					@ApiResponse(code=400, message="400 is the message")
			}
	)
	@RequestMapping(value="/getEmpList", method=RequestMethod.GET)
	@ResponseBody
	public List<Emp> getEmpList() {
	    return employeeServiceImpl.getAllEmpDetails();
	}
	
	@ApiOperation("Get an Employee Details")
	@RequestMapping(value="/getEmp/{empId}", method=RequestMethod.GET)
	@ResponseBody
	public Emp getEmp(@PathVariable String empId) {
		return employeeServiceImpl.getEmpDetails(empId);
	}
	
	@ApiOperation("Delete an Employee")
	@RequestMapping(value="/deleteEmp", method=RequestMethod.POST)
	@ResponseBody
	public String deleteEmp(@RequestBody final String empId) {
		return (employeeServiceImpl.deleteEmp(empId)? "Deleted" : "Could Not be Deleted");
	}
	
	@ApiOperation("Add an Employee")
	@RequestMapping(value="/addEmp", method=RequestMethod.POST)
	@ResponseBody
	public String addEmp(
			@RequestBody final Emp e) {
		return (employeeServiceImpl.addEmp(e)? "Emp added" : "Emp could not be added");		
	}
	
}