package com.example.pos.Repository;

import com.example.pos.Entity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Integer> {
}
