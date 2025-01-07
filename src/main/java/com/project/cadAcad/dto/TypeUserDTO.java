package com.project.cadAcad.dto;

import com.project.cadAcad.entities.TypeUser;

public class TypeUserDTO {
    private Long typeId;
    private String nameType;

    public TypeUserDTO(Long typeId, String nameType) {
        this.typeId = typeId;
        this.nameType = nameType;
    }

    public TypeUserDTO(TypeUser entity) {
        typeId = entity.getTypeId();
        nameType = entity.getNameType();
    }

}
