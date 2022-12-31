package com.example.nubesexercitatio.repository;

import com.example.nubesexercitatio.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity,Integer> {
}
