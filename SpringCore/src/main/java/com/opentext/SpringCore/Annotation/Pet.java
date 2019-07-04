package com.opentext.SpringCore.Annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pet implements InitializingBean, DisposableBean {
	private String name;

	@Autowired
	@Qualifier("cat")
	private Animal animal;

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void doingSomething() {
		animal.eat();
		animal.makingSound();
	}

	public void destroy() throws Exception {
		System.out.println("Destroy phase*****");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Phase*****");

	}

	// @postconstruct
	// public void init() {
	// System.out.println("Inti phase*****");
	// }
	// @preDestory
	// public void destroy() {
	// System.out.println("Destroy phase*****");
	// }
}// End class
