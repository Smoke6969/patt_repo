package com.company.structural.bridge.with;

public abstract class Shape {

	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract public void applyColor();

}
