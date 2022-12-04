package org.launchcode.skillstracker;

import org.launchcode.controllers.SkillsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkillsTrackerApplication extends SkillsController {

	public static void main(String[] args) {
		SpringApplication.run(SkillsTrackerApplication.class, args);

	}

}
