package com.project.cadAcad.repositories;

import com.project.cadAcad.entities.SchoolCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolCategoryRepository extends JpaRepository<SchoolCategory, Long> {

}