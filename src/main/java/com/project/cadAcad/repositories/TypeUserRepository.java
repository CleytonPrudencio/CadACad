package com.project.cadAcad.repositories;

import com.project.cadAcad.entities.TypeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeUserRepository extends JpaRepository<TypeUser, Long> {
}
