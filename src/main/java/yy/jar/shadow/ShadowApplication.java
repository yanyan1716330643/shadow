package yy.jar.shadow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("yy.jar.shadow")
@SpringBootApplication
public class ShadowApplication {

	public static void main(String[] args) {
		System.out.println("start ................................................................");
		SpringApplication.run(ShadowApplication.class, args);
		System.out.println("running ................................................................");
	}
}
