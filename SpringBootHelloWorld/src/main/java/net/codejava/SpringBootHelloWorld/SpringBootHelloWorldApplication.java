package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "<strong>hola mundo jaja</strong> <br>" +
				"<img src=\"https://pbs.twimg.com/media/GEOBpYLWIAABGSS.jpg\" alt=\"Mr Tartaria\">";
	}


	@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", methods = {RequestMethod.GET})
	@RequestMapping("/new")
	public String newHome(){
		return "<strong>Leo y camilo hola mundo</strong> <br>" +
				"<img src=\"https://pbs.twimg.com/media/GEOBpYLWIAABGSS.jpg\" alt=\"Mr Tartaria\">";
	}
}
