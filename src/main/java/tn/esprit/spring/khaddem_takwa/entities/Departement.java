package tn.esprit.spring.khaddem_takwa.entities;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Departement")
public class Departement implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Integer idDepart; // Clé primaire
    private String nomDepat;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}


