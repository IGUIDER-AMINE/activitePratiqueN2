package ma.enset.studentsapp.entities;

import java.util.Date;

public class RendezVous {
    private Long id;
    private Date date;
    private StatusRDV status; // type enum
    private Patient patient;
    private Medecin medecin;
}
