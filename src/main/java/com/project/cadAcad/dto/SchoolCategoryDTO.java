package com.project.cadAcad.dto;

import com.project.cadAcad.entities.SchoolCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolCategoryDTO {
    private Long categoryId;
    private String categoryName;

    public SchoolCategoryDTO(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public SchoolCategoryDTO(SchoolCategory entity) {
        categoryId = entity.getCategoryId();
        categoryName = entity.getCategoryName();
    }
}
