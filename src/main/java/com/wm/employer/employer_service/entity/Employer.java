package com.wm.employer.employer_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "TB_EMPLOYER")
@Entity
@Getter
@Setter
public class Employer extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "TYPE")
    private Character type;

    @Column(name = "ADDRESS")
    private String address;
}
