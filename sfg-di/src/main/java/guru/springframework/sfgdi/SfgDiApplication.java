package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		// Getting a handle on the Spring Application Context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// Asking the application context for an instance of MyController
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("-------------------------------------------------Primary Bean");
		System.out.println(myController.sayHello());

		// By default when Spring creates beans, the string name of the bean is going to be the class name but beginning with a lower case

//		String greeting = myController.sayHello();
//
//		System.out.println(greeting);



		/*
		 *  What happens here ?
		 *  	I did not have to create a new MyController. The Spring framework did that for me.
		 *  	Inside the Spring Context:
		 * 	Spring is creating a new instance of the "MyController" class
		 * 	and putting it into the context
		 * 	and on line 14 my code is asking Spring for and instance of that,
		 * 	so from the context provide me one
		 * 	This is how inversion of control works
		 * */


		System.out.println("----------------------------------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------------------------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------------------------------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}


}
