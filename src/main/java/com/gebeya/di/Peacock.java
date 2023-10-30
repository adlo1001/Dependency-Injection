package com.gebeya.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Peacock {

	@Autowired
	Animal bird;
	// Bird bird = new Bird();


	public String getSpecies() {
		return bird.getSpecies();
	}

}
