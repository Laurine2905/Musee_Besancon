package isis.projet.backend.dao;

import jakarta.persistence.Tuple;
import isis.projet.backend.entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface SalleRepository extends JpaRepository<Salle, Integer> {


// Liste de toutes les salles
    @Query("select Salle_nom "
            + "from Salle"
            + "order by Salle_nom")
    public List<Tuple> allSalles();
}