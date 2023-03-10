package isis.projet.backend.dao;

import jakarta.persistence.Tuple;
import isis.projet.backend.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface CategorieRepository extends JpaRepository<Categorie, Integer> {


// Liste de toutes les categories
    @Query("select Categorie_nom "
            + "from Categorie"
            + "order by Categorie_nom")
    public List<Tuple> allCategorie();
}