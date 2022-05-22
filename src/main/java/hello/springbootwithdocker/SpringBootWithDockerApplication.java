package hello.springbootwithdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class SpringBootWithDockerApplication {
    
        @RequestMapping("/")
         public String home() {
             return "My Docker app works!";
          }
     
        public static void main(String[] args) {
		SpringApplication.run(SpringBootWithDockerApplication.class, args);
	}

}
