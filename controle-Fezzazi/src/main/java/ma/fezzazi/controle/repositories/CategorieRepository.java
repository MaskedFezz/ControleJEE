package ma.fezzazi.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.fezzazi.controle.entities.Categorie;
import java.util.List;


@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
//    @Query("SELECT a FROM Article a JOIN a.categorie c WHERE c.id = :categorieId")
//	List<Categorie> findByCategorie(Long categorieId);
//    List<Categorie> findByCategorie(Categorie categorie);

	    List<Categorie> findByCategorie(Categorie category);
}