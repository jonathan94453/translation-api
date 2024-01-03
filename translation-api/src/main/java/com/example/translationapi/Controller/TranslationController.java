package com.example.translationapi.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class TranslationController {
    // mvn spring-boot:run -f "C:\Jonathan\translation-api\translation-api\pom.xml"
    @GetMapping("/")
    public String rootEndpoint() {
        return "Welcome to the root endpoint";
    }



@PostMapping("/translate") 
public String translate(@RequestBody TranslationRequest request) {
    return request.gettext() + "WORKS" + request.gettargetlang();   
} 
@GetMapping("/health")
public String health() {
    return "HEALTH WORKS"; 
}






}
