package log4j2.jsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import log4j2.jsample.beans.HelloWorld;

@Configuration
public class SpringConfig {

	@Bean
	public HelloWorld helloWorld(ApplicationContext ctx) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("Spring World !!!");
		return helloWorld;

	}
}
