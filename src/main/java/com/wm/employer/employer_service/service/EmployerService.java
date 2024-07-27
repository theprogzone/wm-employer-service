package com.wm.employer.employer_service.service;

import com.wm.employer.employer_service.model.EmployerDTO;

public interface EmployerService {

    EmployerDTO getEmployer(String email);
}
