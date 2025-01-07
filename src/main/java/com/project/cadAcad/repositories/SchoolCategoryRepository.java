package com.project.cadAcad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolCategoryRepository extends JpaRepository<SchoolCategoryRepository, Long> {

}