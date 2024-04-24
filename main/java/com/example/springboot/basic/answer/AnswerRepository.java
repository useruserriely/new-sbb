package com.example.springboot.basic.answer;

import com.example.springboot.basic.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
