package com.example.springboot.basic;

import com.example.springboot.basic.question.Question;
import com.example.springboot.basic.question.QuestionRepository;
import com.example.springboot.basic.question.QuestionService;
import com.example.springboot.basic.sbb.SpringbootBasicApplication;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

@SpringBootTest(classes = SpringbootBasicApplication.class)
@ExtendWith(SpringExtension.class)
class SpringbootBasicApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i<=300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]\", i");
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}
}
