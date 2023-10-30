package com.gebeya.di;

import org.springframework.stereotype.Component;

@Component
public interface Animal {

	public String getSpecies();

	public boolean hasWings();

}
