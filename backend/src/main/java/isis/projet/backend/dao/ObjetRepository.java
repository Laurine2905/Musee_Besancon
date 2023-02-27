package isis.projet.backend.dao;


import isis.projet.backend.entity.Objet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ObjetRepository extends JpaRepository<Objet, Integer> {

    /**
     * Trouve un objet par son nom.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param ObjetName
     * @return L'objet correspondant au nom fourni, ou null si pas trouvé.
     */
    public Objet findByName(String ObjetName);
}