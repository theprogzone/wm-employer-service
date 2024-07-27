package com.wm.employer.employer_service.repository;

import com.wm.employer.employer_service.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {

    Optional<Employer> findEmployerByEmail(String email);
}
