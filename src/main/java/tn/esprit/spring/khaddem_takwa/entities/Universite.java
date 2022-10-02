package tn.esprit.spring.khaddem_takwa.entities;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Integer idUniv; // Clé primaire
    private String nomUniv;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}
