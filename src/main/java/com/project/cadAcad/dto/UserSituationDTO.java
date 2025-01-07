package com.project.cadAcad.dto;

import com.project.cadAcad.entities.UserSituation;

public class UserSituationDTO {
    private Long situationId;
    private String situationName;

    public UserSituationDTO(Long situationId, String situationName) {
        this.situationId = situationId;
        this.situationName = situationName;
    }

    public UserSituationDTO(UserSituation entity) {
        situationId = entity.getSituationId();
        situationName = entity.getSituationName();
    }

}
