package UrlManager.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;

    // Cria uma nova URL encurtada
    public Url shortenUrl(String originalUrl) {
        Url url = new Url();
        url.setOriginalUrl(originalUrl);
        url.setShortUrl(generateShortUrl());
        return repository.save(url);
    }

    // Gera um código curto aleatório
    private String generateShortUrl() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    // Lista todas as URLs
    public List<Url> listAll() {
        return repository.findAll();
    }

    // Busca uma URL pelo código curto
    public Url findByShortUrl(String shortUrl) {
        return repository.findByShortUrl(shortUrl);
    }

    // Deleta pelo ID
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
