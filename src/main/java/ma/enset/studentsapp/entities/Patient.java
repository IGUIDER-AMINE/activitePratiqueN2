package ma.enset.studentsapp.entities;

import jakarta.persistence.Entity;

import java.util.Collection;
@Entity
public class Patient {
    private Long id;
    private String nom;
    private String dateNaissanec;
    private boolean malade;
    private int score;
    private Collection<RendezVous> rendezVous;
}
