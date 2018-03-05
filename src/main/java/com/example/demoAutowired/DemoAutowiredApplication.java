package com.example.demoAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class DemoAutowiredApplication {

	@Autowired	User mark;
	@Autowired  User anne;

	public static void main(String[] args) {
		SpringApplication.run(DemoAutowiredApplication.class, args);
	}

	@PostConstruct
	private void setNames(){
		mark.setName("Mark");
		anne.setName("Anne");
	}

	@RequestMapping("sayMarkName")
	public String sayMarkName(){
		return mark.getName();
	}

	@RequestMapping("sayAnneName")
	public String sayAnneName(){
		return anne.getName();
	}
}
