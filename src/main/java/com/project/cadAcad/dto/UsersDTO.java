package com.project.cadAcad.dto;

import com.project.cadAcad.entities.Users;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UsersDTO {
    private Long userId;
    private String username;
    private String email;
    private String telefone;
    private String address;
    private String situation;
    private String passwordHash;
    private String user_type;
    private Long schoolId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UsersDTO(Long userId, String username, String email, String telefone, String address, String situation, String passwordHash, String user_type, Long schoolId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.telefone = telefone;
        this.address = address;
        this.situation = situation;
        this.passwordHash = passwordHash;
        this.user_type = user_type;
        this.schoolId = schoolId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UsersDTO(Users entity) {
        userId = entity.getUserId();
        username = entity.getUsername();
        email = entity.getEmail();
        telefone = entity.getTelefone();
        address = entity.getAddress();
        situation = entity.getSituation();
        passwordHash = entity.getPasswordHash();
        user_type = entity.getUser_type();
        schoolId = entity.getSchoolId();
        createdAt = entity.getCreatedAt();
        updatedAt = entity.getUpdatedAt();
    }

    public UsersDTO() {

    }
}
