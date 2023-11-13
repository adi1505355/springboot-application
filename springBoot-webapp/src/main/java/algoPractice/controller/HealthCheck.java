package algoPractice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/health")
public class HealthCheck {

    @GetMapping("/")
    public ResponseEntity healthCheck() {
        System.out.println("Health check endpoint accessed.");
        // Add your health check logic here
        String responseBody = "<h1>aditya_health</h1>";

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }
}