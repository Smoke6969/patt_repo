package com.company.structural.decorator;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	@Override
	public String make(){
		return customSandwich.make() + addMeat();
	}


	private String addMeat() {

		return " + mustard";
	}
}
