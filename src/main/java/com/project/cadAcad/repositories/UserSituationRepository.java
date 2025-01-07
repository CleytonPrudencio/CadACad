package com.project.cadAcad.repositories;

import com.project.cadAcad.entities.UserSituation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSituationRepository extends JpaRepository<UserSituation, Long> {

}
