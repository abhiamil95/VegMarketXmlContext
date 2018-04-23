package Annotation.Configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class Meal {
	//@Autowired
	private Fruit fruit;
	//@Autowired
	private Vegetable veg;
	
	Meal(){}

	@Autowired
	public Meal(Fruit fruit, Vegetable veg) {
		super();
		this.fruit = fruit;
		this.veg = veg;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Vegetable getVeg() {
		return veg;
	}

	public void setVeg(Vegetable veg) {
		this.veg = veg;
	}
	
	public String display()
	{
		String disp="Meal have:";
		if(fruit!=null) disp += "BANANA";
		if(veg!=null) disp+="Cabbage";
		return disp;
	}

}
