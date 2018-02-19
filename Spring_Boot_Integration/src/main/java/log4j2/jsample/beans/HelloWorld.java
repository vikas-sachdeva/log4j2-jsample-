package log4j2.jsample.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello " + name);

	}
}
