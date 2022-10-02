package tn.esprit.spring.khaddem_takwa.entities;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat; // Clé primaire
    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal (TemporalType.DATE)
    private Date dateFinContrat;
    private Boolean archive;
    private Integer montantContart;

    private String nomE;
    @Enumerated(EnumType.STRING)

    private Specialite specialite;
// Constructeur et accesseurs (getters) et mutateurs (setters)

}
