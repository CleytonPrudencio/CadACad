package com.project.cadAcad.services;

import com.project.cadAcad.dto.UsersDTO;
import com.project.cadAcad.entities.Users;
import com.project.cadAcad.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UsersDTO findByUserId(Long userId) {
        Users users = repository.findByUserId(userId);
        return new UsersDTO(users);
    }
}
