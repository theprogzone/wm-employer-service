package com.wm.employer.employer_service.service;

import com.wm.employer.employer_service.entity.Employer;
import com.wm.employer.employer_service.exception.ResourceNotFoundException;
import com.wm.employer.employer_service.model.EmployerDTO;
import com.wm.employer.employer_service.repository.EmployerRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployerServiceImpl implements EmployerService {

    private final EmployerRepository employerRepository;

    @SneakyThrows
    @Override
    public EmployerDTO getEmployer(String email) {
        Optional<Employer> employerOptional = employerRepository.findEmployerByEmail(email);
        if (employerOptional.isEmpty()) {
            throw new ResourceNotFoundException("Cannot find the employer");
        }
        EmployerDTO employerDTO = new EmployerDTO();
        BeanUtils.copyProperties(employerOptional.get(), employerDTO);
        return employerDTO;
    }
}
