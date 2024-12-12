package com.project.cadAcad.dto;

import com.project.cadAcad.entities.School;
import com.project.cadAcad.entities.SchoolCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolDTO {
    private Long schoolId;
    private String schoolName;
    private String schoolAddress;
    private SchoolCategory schoolCategory;

    public SchoolDTO(Long schoolId, String schoolName, String schoolAddress, SchoolCategory schoolCategory) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolCategory = schoolCategory;
    }

    public SchoolDTO(School entity) {
        schoolId = entity.getSchoolId();
        schoolName = entity.getSchoolName();
        schoolAddress = entity.getSchoolAddress();
        schoolCategory = entity.getSchoolCategory();
    }

    public SchoolDTO() {

    }
}
