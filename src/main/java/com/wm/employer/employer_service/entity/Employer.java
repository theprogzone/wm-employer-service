package com.wm.employer.employer_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "TB_EMPLOYER")
@Entity
@Getter
@Setter
public class Employer {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private Character type;

    private String address;
}
