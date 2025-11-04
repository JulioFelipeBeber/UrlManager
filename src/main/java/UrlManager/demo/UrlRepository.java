package UrlManager.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface responsável por acessar o banco de dados
public interface UrlRepository extends JpaRepository<Url, Long> {
}
