package com.company.creational.builder;

public class BuilderDemo {

	public static void main(String[] args){

		LunchOrder order = new LunchOrder.Builder()
				.bread("Wheat")
				.condiments("Lettuce")
				.dressing("Mayo")
				.meat("Ham")
				.build();

	}
}
