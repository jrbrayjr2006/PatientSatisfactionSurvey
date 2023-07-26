package com.satterfieldmedical.survey.patientsatisfactionsurvey.patient;

import com.satterfieldmedical.survey.patientsatisfactionsurvey.patient.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PatientSurveyService {
    public List<Patient> getPatients() {
        List<Patient> patients = new ArrayList<>();
        patients = populatePatients();
        return patients;
    }

    private List<Patient> populatePatients() {
        Patient patient = Patient.builder().id(1).firstName("John").lastName("Doe").build();
        List<Patient> patients = Collections.singletonList(patient);
        return patients;
    }
}
