package com.market;

public class Vegitables {

    private String name;
    
    public Vegitables() {
    
		// TODO Auto-generated constructor stub
	}
	public Vegitables(String name) {
		setName(name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void display()
	{
		System.out.println("veg");
		String disp = null;
		if(name!=null && name!="")
		{	disp ="name of veg is"+name;
		}
		System.out.println(disp);
	}
}
