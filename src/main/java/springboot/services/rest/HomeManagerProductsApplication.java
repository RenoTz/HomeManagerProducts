package springboot.services.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class HomeManagerProductsApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(HomeManagerProductsApplication.class);

	public static void main(String[] args) throws UnknownHostException {

		final SpringApplication app = new SpringApplication(HomeManagerProductsApplication.class);

		final Environment env = app.run(args).getEnvironment();

		LOGGER.info(
				"\n----------------------------------------------------------\n\t"
						+ "Application '{}' is running! Access URLs:\n\t" + "Local: \t\t{}://localhost:{}\n\t"
						+ "External: \t{}://{}:{}\n" + "----------------------------------------------------------",
				env.getProperty("spring.application.name"), "http", env.getProperty("server.port"), "http",
				InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port"));
	}

}
