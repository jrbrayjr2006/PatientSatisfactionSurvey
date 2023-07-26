package com.satterfieldmedical.survey.patientsatisfactionsurvey.patient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private long id;
    private String firstName;
    private String lastName;
}
