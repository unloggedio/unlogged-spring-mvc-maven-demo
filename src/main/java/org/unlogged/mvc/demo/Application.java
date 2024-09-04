package org.unlogged.mvc.demo;

import io.unlogged.Unlogged;
import io.unlogged.UnloggedMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Unlogged(unloggedMode = UnloggedMode.LogAnnotatedOnly)
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
