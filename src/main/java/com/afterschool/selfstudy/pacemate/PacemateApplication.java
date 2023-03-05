package com.afterschool.selfstudy.pacemate;

import com.afterschool.selfstudy.pacemate.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class PacemateApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacemateApplication.class, args);
	}

}
