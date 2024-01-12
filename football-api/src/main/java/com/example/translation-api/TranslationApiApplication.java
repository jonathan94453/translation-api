

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; 

@SpringBootApplication
@ComponentScan(basePackages = "com.example.footballapi")
public class TranslationApiApplication {

	public static void main(String[] args) {
	 SpringApplication.run(TranslationApiApplication.class, args); 
			}    
		
}




