package com.devsuperior.bds01.controllers;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> findAll() {
        List<Department> listDepartment = repository.findAll(Sort.by("name"));

        List<DepartmentDTO> listDepartmentDto = listDepartment.stream().map(DepartmentDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDepartmentDto);
    }
}
