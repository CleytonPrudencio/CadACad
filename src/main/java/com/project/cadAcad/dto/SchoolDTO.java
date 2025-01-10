package com.project.cadAcad.dto;

import com.project.cadAcad.entities.School;
import com.project.cadAcad.entities.SchoolCategory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SchoolDTO {
    private Long schoolId;
    private String schoolName;
    private String schoolAddress;
    private SchoolCategory schoolCategory;
    private String telephone;
    private String email;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

    public SchoolDTO(Long schoolId, String schoolName, String schoolAddress, SchoolCategory schoolCategory,
                     String telephone, String email, LocalDateTime creationDate, LocalDateTime updateDate) {

        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolCategory = schoolCategory;
        this.telephone = telephone;
        this.email = email;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public SchoolDTO(School entity) {
        schoolId = entity.getSchoolId();
        schoolName = entity.getSchoolName();
        schoolAddress = entity.getSchoolAddress();
        schoolCategory = entity.getSchoolCategory();
        telephone = entity.getTelephone();
        email = entity.getEmail();
        creationDate = entity.getCreationDate();
        updateDate = entity.getUpdateDate();
    }
}
