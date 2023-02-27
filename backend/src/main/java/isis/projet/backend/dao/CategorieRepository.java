package isis.projet.backend.dao;

import jakarta.persistence.Tuple;
import isis.projet.backend.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface CategorieRepository extends JpaRepository<Categorie, Integer> {


// Liste de toutes les categories
    @Query("select ca.name "
            + "from Categorie ca"
            + "order by cou.name")
    public List<Tuple> allCategorie();
}