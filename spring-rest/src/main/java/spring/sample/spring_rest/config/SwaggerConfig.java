package spring.sample.spring_rest.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	public Docket empDetailsApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("spring.sample.spring_rest.Controllers"))
				.paths(regex("/spring-rest.*"))
				.build()
				.apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		ApiInfo apiInfo =  new ApiInfo(
				"Spring Boot Swagger Sample API", 
				"Description of Spring Boot Swagger Sample API", 
				"1.0",
				"This is sample terms and condition", 
				new Contact("Sushanta Sinha", "http://www.isf.com", "sushanta.sinha@gmail.com"), 
				"Apache License", 
				"http://www.apache.org/licenses/");		
		return apiInfo;
	}
	
}
