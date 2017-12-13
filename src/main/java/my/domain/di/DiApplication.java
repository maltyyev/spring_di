package my.domain.di;

import my.domain.di.controllers.ConstructorInjectedController;
import my.domain.di.controllers.GetterInjectedController;
import my.domain.di.controllers.MyController;
import my.domain.di.controllers.PropertyInjectedController;
import my.domain.di.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
	}
}
