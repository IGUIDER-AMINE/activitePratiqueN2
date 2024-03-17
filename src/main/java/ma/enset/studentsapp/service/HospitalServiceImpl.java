package ma.enset.studentsapp.service;

import jakarta.transaction.Transactional;
import ma.enset.studentsapp.entities.Consultation;
import ma.enset.studentsapp.entities.Medecin;
import ma.enset.studentsapp.entities.Patient;
import ma.enset.studentsapp.entities.RendezVous;
import ma.enset.studentsapp.repository.ConsultationRepository;
import ma.enset.studentsapp.repository.MedecinRepository;
import ma.enset.studentsapp.repository.PatientRepository;
import ma.enset.studentsapp.repository.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return null;
    }

    @Override
    public Patient saveMedecin(Medecin medecin) {
        return null;
    }

    @Override
    public Patient saveRDV(RendezVous rendezVous) {
        return null;
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return null;
    }
}
