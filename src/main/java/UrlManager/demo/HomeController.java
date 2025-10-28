package UrlManager.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "🚀 Servidor rodando! Spring Boot com H2 e JPA funcionando!";
    }
}
