package com.wm.employer.employer_service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployerDTO {

    private String name;

    private String email;

    private String phone;

    private Character type;

    private String address;
}
