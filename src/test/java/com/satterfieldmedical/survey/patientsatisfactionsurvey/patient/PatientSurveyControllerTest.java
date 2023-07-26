package com.satterfieldmedical.survey.patientsatisfactionsurvey.patient;

import com.satterfieldmedical.survey.patientsatisfactionsurvey.patient.Patient;
import com.satterfieldmedical.survey.patientsatisfactionsurvey.patient.PatientSurveyController;
import com.satterfieldmedical.survey.patientsatisfactionsurvey.patient.PatientSurveyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PatientSurveyControllerTest {

    private PatientSurveyController patientSurveyController;
    private MockMvc mockMvc;
    private PatientSurveyService mockPatientSurveyService;

    @BeforeEach
    void setUp() {
        mockPatientSurveyService = mock(PatientSurveyService.class);
        patientSurveyController = new PatientSurveyController(mockPatientSurveyService);
        mockMvc = MockMvcBuilders.standaloneSetup(patientSurveyController).build();
    }

    @Test
    void whenGetPatients_thenReturnStatusIsOk() throws Exception {
        // Given
        List<Patient> patients = Collections.singletonList(new Patient());
        when(mockPatientSurveyService.getPatients()).thenReturn(patients);
        // When
        MvcResult result = mockMvc.perform(get("/patients"))
                .andExpect(status().isOk())
                .andReturn();
        // Then
        assertEquals(MediaType.APPLICATION_JSON_VALUE, result.getResponse().getContentType());
    }

    @Test
    void givenRequest_whenGetPatients_thenInvokePatientSurveyService() {
        // Given
        List<Patient> patients = Collections.singletonList(new Patient());
        when(mockPatientSurveyService.getPatients()).thenReturn(patients);
        // When
        patientSurveyController.getPatient();
        // Then
        verify(mockPatientSurveyService).getPatients();
    }


}
