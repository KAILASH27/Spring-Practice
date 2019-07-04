package com.opentext.SpringCore.Annotation;

import org.springframework.context.annotation.Bean;

public class AnimalConfig {

	@Bean(name = "dog")
	public Animal animal() {
		return new Dog();
	}

	@Bean(name = "cat")
	public Animal animal1() {
		return new Cat();
	}
}// End Class
