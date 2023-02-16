package isis.projet.backend.entity;

import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Salle {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Salle_id;

    // Nom de la catégorie
    @Column(nullable = false, unique=true)
    @NonNull
    private String Salle_nom;

    @OneToMany(mappedBy="salle")
    @ToString.Exclude // On ne veut pas inclure la liste des objets dans le toString
    private List<Objet> objets = new ArrayList<>();

}
