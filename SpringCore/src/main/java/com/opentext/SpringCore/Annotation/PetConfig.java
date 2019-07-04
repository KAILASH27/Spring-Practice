package com.opentext.SpringCore.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AnimalConfig.class)
public class PetConfig {

	@Bean
	public Pet pet() {
		return new Pet();
	}

}// End Class
