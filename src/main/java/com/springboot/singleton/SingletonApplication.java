package com.springboot.singleton;

import com.springboot.singleton.model.LoggingSingleton;
import com.springboot.singleton.utils.LogLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SingletonApplication.class, args);

		// logging singleton test.
		LoggingSingleton instance = LoggingSingleton.getInstance();
		instance.logSomething("This is my message.", LogLevel.WARN);
	}
}
