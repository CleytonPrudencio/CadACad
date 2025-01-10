package com.project.cadAcad.dto;

import com.project.cadAcad.entities.UsersSituation;

public class UsersSituationDTO {
    private Long situationId;
    private String situationName;

    public UsersSituationDTO(Long situationId, String situationName) {
        this.situationId = situationId;
        this.situationName = situationName;
    }

    public UsersSituationDTO(UsersSituation entity) {
        situationId = entity.getSituationId();
        situationName = entity.getSituationName();
    }

}
