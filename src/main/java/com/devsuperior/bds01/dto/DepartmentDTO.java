package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO {
    public Long id;
    public String name;

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO() {
    }

    public DepartmentDTO( Department department){
        this.id = department.getId();
        this.name = department.getName();
    }
}
