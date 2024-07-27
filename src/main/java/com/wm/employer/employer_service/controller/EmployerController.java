package com.wm.employer.employer_service.controller;

import com.wm.employer.employer_service.model.EmployerDTO;
import com.wm.employer.employer_service.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employer")
@RequiredArgsConstructor
public class EmployerController {

    private final EmployerService employerService;

    @GetMapping(value = "/{email}")
    public ResponseEntity<EmployerDTO> getEmployerByEmail(@PathVariable String email) {
        return new ResponseEntity<>(employerService.getEmployer(email), HttpStatus.OK);
    }
}
