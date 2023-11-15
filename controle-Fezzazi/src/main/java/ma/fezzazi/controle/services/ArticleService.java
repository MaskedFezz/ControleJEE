package ma.fezzazi.controle.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fezzazi.controle.dao.IDao;
import ma.fezzazi.controle.entities.Article;
import ma.fezzazi.controle.entities.Categorie;
import ma.fezzazi.controle.repositories.ArticleRepository;

@Service
public class ArticleService implements IDao<Article> {
	@Autowired
	ArticleRepository articleRepository;

	@Override
	public Article create(Article o) {
		return articleRepository.save(o);
	}

	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	@Override
	public Article update(Article o) {
		return articleRepository.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
			articleRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Article findById(Long id) {
		return articleRepository.findById(id).orElse(null);
	}

	public List<Article> findByCategorie(Categorie categorie){
		return articleRepository.findByCategorie(categorie);
	}

	public List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin){
		return articleRepository.findByDateProductionBetween(dateDebut, dateFin);
	}
}
