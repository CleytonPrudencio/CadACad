package com.project.cadAcad.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "school")
@Getter
@Setter
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolId;
    private String schoolName;
    private String schoolAddress;
    private String telephone;
    private String email;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

    @ManyToOne
    @JoinColumn(name = "school_categories")
    private SchoolCategory schoolCategory;
}
