package isis.projet.backend.dao;


import isis.projet.backend.entity.MultimediaCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface MultimediaCatRepository extends JpaRepository<MultimediaCat, Integer> {

}