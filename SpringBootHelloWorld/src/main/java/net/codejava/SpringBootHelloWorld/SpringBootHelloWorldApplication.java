package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
	@RequestMapping("/new")
	public String home(){
		return "<strong>Leo y camilo hola mundo</strong> <br>" +
				"<img src=\"https://pbs.twimg.com/media/GEOBpYLWIAABGSS.jpg\" alt=\"Mr Tartaria\">";
	}
}
