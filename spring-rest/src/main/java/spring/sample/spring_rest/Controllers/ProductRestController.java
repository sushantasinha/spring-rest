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
import spring.sample.spring_rest.Model.Product;
import spring.sample.spring_rest.Service.EmployeeServiceImpl;
import spring.sample.spring_rest.Service.ProductServiceImpl;


@RestController
@RequestMapping("/v1")
@Api(value="Sample Product Rest Controller", description="Description of Product Rest Controller")
public class ProductRestController
{	
	@Autowired
	ProductServiceImpl productServiceImpl;

	@ApiOperation("Get all Products")
	@ApiResponses(
			value={
					@ApiResponse(code=300, message="300 is the message"),
					@ApiResponse(code=400, message="400 is the message")
			}
	)
	@RequestMapping(value="/getProductList", method=RequestMethod.GET)
	@ResponseBody
	public List<Product> getEmpList() {
	    return productServiceImpl.getAllProductDetails();
	}
	
	@ApiOperation("Get a Product Details")
	@RequestMapping(value="/getProduct/{productId}", method=RequestMethod.GET)
	@ResponseBody
	public Product getEmp(@PathVariable String productId) {
		return productServiceImpl.getProductDetails(productId);
	}
	
}