package setter.injection.demo;

public class Meal {

	private Grain grain;
	private Meat meat;
	public Meal() {
		// TODO Auto-generated constructor stub
	}
	
	public Meal(Grain g, Meat m) {
		super();
		this.grain = g;
		this.meat = m;
	}

	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	
	public String mealmenu()
	{
		String menu="Meal Have:";
		if(grain!=null) menu+="some grain:";
		if(grain!=null) menu+="some meat:";
		return menu;
	}

}
