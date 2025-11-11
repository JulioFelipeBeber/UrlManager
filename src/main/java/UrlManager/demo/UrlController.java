package UrlManager.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
public class UrlController {

    @Autowired
    private UrlService service;

    // 🔹 Criar nova URL encurtada
    @PostMapping("/api/urls")
    public Url create(@RequestParam String originalUrl) {
        return service.shortenUrl(originalUrl);
    }

    // 🔹 Listar todas as URLs salvas
    @GetMapping("/api/urls")
    public List<Url> listAll() {
        return service.listAll();
    }

    // 🔹 Deletar uma URL pelo ID
    @DeleteMapping("/api/urls/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // 🔹 Redirecionar o shortUrl direto na raiz
    @GetMapping("/{shortUrl}")
    public ResponseEntity<Void> redirectToOriginal(@PathVariable String shortUrl) {
        Url url = service.findByShortUrl(shortUrl);
        if (url != null) {
            return ResponseEntity.status(HttpStatus.FOUND)
                    .location(URI.create(url.getOriginalUrl()))
                    .build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
