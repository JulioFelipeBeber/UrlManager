package UrlManager.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/urls")
public class UrlController {

    @Autowired
    private UrlRepository repository;

    @GetMapping
    public List<Url> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Url criar(@RequestBody Url url) {
        return repository.save(url);
    }
}
