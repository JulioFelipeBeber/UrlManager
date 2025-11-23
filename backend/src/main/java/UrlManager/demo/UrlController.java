package UrlManager.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")

public class UrlController {

    @Autowired
    private UrlService service;

    // 🔹 Criar nova URL encurtada (JSON)
    @PostMapping("/urls")
    public Url create(@RequestBody UrlRequest request) {
        return service.shortenUrl(request.getOriginalUrl());
    }

    // 🔹 Listar URLs
    @GetMapping("/urls")
    public List<Url> listAll() {
        return service.listAll();
    }

    // 🔹 Deletar
    @DeleteMapping("/urls/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // 🔹 Redirecionamento
    @GetMapping("/r/{shortUrl}")
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
