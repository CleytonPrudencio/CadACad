package com.project.cadAcad.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_situation")
@Getter
@Setter
public class UsersSituation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long situationId;
    private String situationName;
}
