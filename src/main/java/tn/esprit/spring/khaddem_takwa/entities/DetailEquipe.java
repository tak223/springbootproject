package tn.esprit.spring.khaddem_takwa.entities;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Integer idDetailEquipe; // Clé primaire
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}
