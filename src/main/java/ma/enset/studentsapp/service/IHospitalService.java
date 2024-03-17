package ma.enset.studentsapp.service;

import ma.enset.studentsapp.entities.Consultation;
import ma.enset.studentsapp.entities.Medecin;
import ma.enset.studentsapp.entities.Patient;
import ma.enset.studentsapp.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Patient saveMedecin(Medecin medecin);
    Patient saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
