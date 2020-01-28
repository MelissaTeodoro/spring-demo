package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import guru.springframework.services.PrimaryGreetingService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController"); //O nome do bean deve estar em minusculo
		controller.hello();

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello() + " PropertyInjectedController");
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello() + " GetterInjectedController");
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello() + " ConstructorInjectedController");
		//System.out.println(ctx.getBean(PrimaryGreetingService.class).sayGreeting() + " PrimaryGreetingService");
	}
}
