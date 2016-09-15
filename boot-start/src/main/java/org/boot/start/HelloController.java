package org.boot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HelloController {

	/**
	 * How to run? <br>
	 * Run as Maven Build,<br>
	 * Goal = spring-boot:run;
	 * @return
	 */
    @RequestMapping("/")
    @ResponseBody
    String greeting() {
        return "Hello World";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}