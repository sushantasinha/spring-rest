package spring.sample.spring_rest.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import spring.sample.spring_rest.Model.Emp;

@Service("employeeService")
public class EmployeeServiceImpl {
	
	List<Emp> empList = new ArrayList<Emp>(Arrays.asList(
			new Emp("1", "Sushanta Sinha", "TM", "sushanta.sinha@gmail.com", 33, 100.10),
			new Emp("2", "Swarnali Roy Sinha", "D", "swarnali.sinha@gmail.com", 28, 50.20),
			new Emp("3", "Tultul Sinha", "SA", "tultul.sinha@gmail.com", 61, 50.30)
			));
	
	public boolean addEmp(Emp e){
		return empList.add(new Emp(e.getId(), e.getName(), e.getDesignation(), e.getDesignation(), e.getAge(), e.getSalary()));
	}
	
	public List<Emp> getAllEmpDetails(){
		return 	empList;
	}
		
	public Emp getEmpDetails(String id) {
		return empList.stream().filter(p -> p.getId().equals(id)).findAny().get();
	}
	
	public boolean deleteEmp(String id){
		return empList.removeIf(p -> p.getId().equals(id));		
	}
	
	/*public static void main (String []args){
		boolean b = (new EmployeeServiceImpl()).deleteEmp("2");
		System.out.println(b);		
	}*/
	
}
