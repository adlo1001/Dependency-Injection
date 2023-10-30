package com.gebeya.di;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Animal {

	public boolean isFlyingBird() {

		return true;
	}

	@Override
	public String getSpecies() {
		// TODO Auto-generated method stub
		return "Uknown Species";
	}

	@Override
	public boolean hasWings() {
		// TODO Auto-generated method stub
		return false;
	}

}
