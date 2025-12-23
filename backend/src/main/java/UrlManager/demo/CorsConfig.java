<<<<<<< HEAD
=======
package UrlManager.demo;

>>>>>>> b6df16b (Projeto full stack: backend Spring Boot + frontend React)
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
<<<<<<< HEAD
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
=======
                        .allowedOrigins("http://localhost:5173")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
>>>>>>> b6df16b (Projeto full stack: backend Spring Boot + frontend React)
            }
        };
    }
}
