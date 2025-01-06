package com.project.cadAcad.controllers;

import com.project.cadAcad.dto.UsersDTO;
import com.project.cadAcad.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cadAcad")
public class UsersController {

    @Autowired
    private UsersService service;

    @GetMapping(value = "/userId/{userId}")
    public ResponseEntity<UsersDTO> findByUserId(@PathVariable Long userId) {
        UsersDTO dto = service.findByUserId(userId);
        return ResponseEntity.ok(dto);
    }
}
