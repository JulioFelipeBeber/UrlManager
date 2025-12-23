package UrlManager.demo;

import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD


// Interface responsável por acessar o banco de dados
=======
>>>>>>> b6df16b (Projeto full stack: backend Spring Boot + frontend React)
public interface UrlRepository extends JpaRepository<Url, Long> {
    Url findByShortUrl(String shortUrl);
}
