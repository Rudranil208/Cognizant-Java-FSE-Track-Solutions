package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args)
	{
		LOGGER.info("START");
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
		LOGGER.info("END");
	}

	public static void displayCountry()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country usa = context.getBean("usa", Country.class);
		Country japan = context.getBean("japan", Country.class);
		Country india = context.getBean("india", Country.class);
		Country germany = context.getBean("germany", Country.class);
		LOGGER.debug("Country : {}", usa.toString());
		LOGGER.debug("Country : {}", japan.toString());
		LOGGER.debug("Country : {}", india.toString());
		LOGGER.debug("Country : {}", germany.toString());
	}

}
