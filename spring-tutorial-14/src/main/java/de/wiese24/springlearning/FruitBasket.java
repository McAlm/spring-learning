package de.wiese24.springlearning;

import java.util.List;

public class FruitBasket {

	private String name;
	private List<String> fruits;

	public FruitBasket(String name, List<String> fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(name);

		sb.append(" contains: \n");

		for (String fruit : this.fruits) {
			sb.append(fruit);
			sb.append("\n");
		}
		return sb.toString();
	}

}
