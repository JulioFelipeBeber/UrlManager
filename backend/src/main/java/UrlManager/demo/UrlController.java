package UrlManager.demo;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
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
=======
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UrlController {

    @Autowired
    private UrlService urlService;

    // POST → cria URL encurtada
    @PostMapping("/urls")
    public Url shorten(@RequestBody Url url) {
        return urlService.shortenUrl(url.getOriginalUrl());
    }

    // GET → redireciona usando o shortUrl
    @GetMapping("/r/{shortUrl}")
    public RedirectView redirect(@PathVariable String shortUrl) {
        Url url = urlService.findByShortUrl(shortUrl);

        if (url == null) {
            throw new RuntimeException("URL não encontrada");
        }

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url.getOriginalUrl());
        return redirectView;
>>>>>>> b6df16b (Projeto full stack: backend Spring Boot + frontend React)
    }
}
