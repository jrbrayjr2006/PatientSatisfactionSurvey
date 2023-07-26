package com.satterfieldmedical.survey.patientsatisfactionsurvey;

import com.satterfieldmedical.survey.patientsatisfactionsurvey.patient.Patient;
import com.satterfieldmedical.survey.patientsatisfactionsurvey.patient.PatientSurveyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatientSurveyServiceTest {

    private PatientSurveyService patientSurveyService;

    @BeforeEach
    void setUp() {
        patientSurveyService = new PatientSurveyService();
    }

    @Test
    void whenGetPatients_isInvoked_thenReturnPatientList() {
        // Given

        // When
        List<Patient> patients = patientSurveyService.getPatients();
        // Then
        assertNotNull(patients);
    }
}