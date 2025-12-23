package UrlManager.demo;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
=======
import jakarta.persistence.*;

@Entity
>>>>>>> b6df16b (Projeto full stack: backend Spring Boot + frontend React)
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String originalUrl;
    private String shortUrl;
<<<<<<< HEAD
=======

    // 🔹 GETTERS E SETTERS (OBRIGATÓRIOS)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
>>>>>>> b6df16b (Projeto full stack: backend Spring Boot + frontend React)
}
