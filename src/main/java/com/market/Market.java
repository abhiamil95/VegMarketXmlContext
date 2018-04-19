package com.market;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Market {
	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		fruit f = appContext.getBean("fruitcollection",fruit.class);
		Vegitables v = (Vegitables) appContext.getBean("Vegitables");
		Vegitables v2=appContext.getBean("VegitablesName",Vegitables.class);
		
		Vegitables v3=appContext.getBean("vegName",Vegitables.class);
		
		Vegitables v4=appContext.getBean("Vegi",Vegitables.class);
		
		fruit f2 = appContext.getBean("ext",fruit.class);
		//v4.display();
		//f.display();
		f2.dispnameUsingExternalFile();
	}

}
