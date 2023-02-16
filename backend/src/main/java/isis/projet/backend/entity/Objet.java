package isis.projet.backend.entity;

import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Objet {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Objet_id;

    // Nom de la catégorie
    @Column(nullable = false, unique=true)
    @NonNull
    private String Objet_nom;

    @Column(nullable = true, unique=true)
    private Integer Objet_annee;

    @Column(nullable = true, unique=true)
    private String Objet_createur;

    @Column(nullable = true, unique=true)
    private String Objet_pays;

    @Column(nullable = true, unique=true)
    private String Objet_description;

    @Column(nullable = true, unique=true)
    private Integer nb_Possession;

    //Photo trouvée via un URL
    @Column(nullable = false, unique=true)
    @NonNull
    private String Objet_photo;
}
