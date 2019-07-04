package com.opentext.SpringCore.AnnotationTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.opentext.SpringCore.Annotation.Animal;
import com.opentext.SpringCore.Annotation.Pet;
import com.opentext.SpringCore.Annotation.PetConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = context.getBean(Pet.class);

		// Animal animal = context.getBean(Animal.class);
		// pet.setAnimal(animal);
		// pet.doingSomething();

		pet.doingSomething();

		context.close();
	}

}
