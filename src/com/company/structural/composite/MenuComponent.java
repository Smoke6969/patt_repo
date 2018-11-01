package com.company.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

	protected String name;
	protected String url;
	protected List<MenuComponent> menuComponents = new ArrayList<>();


	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public MenuComponent add(MenuComponent menuComponent){
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	public MenuComponent remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	@Override
	public abstract String toString();


	protected String print(MenuComponent menuComponent){

		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
}
