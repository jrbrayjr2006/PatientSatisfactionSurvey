package com.satterfieldmedical.survey.patientsatisfactionsurvey.patient;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientSurveyController {

    private final PatientSurveyService patientSurveyService;

    public PatientSurveyController(PatientSurveyService patientSurveyService) {
        this.patientSurveyService = patientSurveyService;
    }

    @GetMapping(value="/patients", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Patient>> getPatient() {
        List<Patient> patients = patientSurveyService.getPatients();
        ResponseEntity<List<Patient>> response = ResponseEntity.of(Optional.of(patients));
        return response;
    }
}
