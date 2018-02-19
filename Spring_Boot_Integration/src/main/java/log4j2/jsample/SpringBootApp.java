package log4j2.jsample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import log4j2.jsample.beans.CommandHandler;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

	private static final Logger LOGGER = LogManager.getLogger(SpringBootApp.class);

	@Autowired
	private CommandHandler commandHandler;

	public static void main(String[] args) {
		LOGGER.info("Starting application ...");
		SpringApplication app = new SpringApplication(SpringBootApp.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
		LOGGER.info("Existing application.");
	}

	@Override
	public void run(String... args) throws Exception {
		commandHandler.execute(args);
	}
}
