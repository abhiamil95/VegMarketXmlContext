package Annotation.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Market {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Annotation/Configuration/appConfig.xml");
		Meal m = appContext.getBean("mealAnnotation",Meal.class);
		System.out.println(m.display());
		((ClassPathXmlApplicationContext)appContext).close();

	}

}
