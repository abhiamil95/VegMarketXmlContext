package setter.injection.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hotel {

	public static void main(String[] args) {
		
			
			ApplicationContext appContext = new ClassPathXmlApplicationContext("setter/injection/demo/context/appContxt.xml");
			Meal m = new Meal();
			System.out.println("Todays Meal :"+m.mealmenu());
			Meal mm = appContext.getBean("meal",Meal.class);
			Meal m2 = appContext.getBean("mlalt",Meal.class);
			Meal m3 = appContext.getBean("mealautowired",Meal.class);
			//System.out.println(mm.mealmenu());
			System.out.println(m3.mealmenu());
			((ClassPathXmlApplicationContext)appContext).close();

	}

}
