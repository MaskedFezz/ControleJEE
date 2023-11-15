package ma.fezzazi.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import ma.fezzazi.controle.entities.Article;
import ma.fezzazi.controle.entities.Categorie;

import java.util.List;
import java.util.Date;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	List<Article> findByCategorie(Categorie categorie);
	List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin);

}
