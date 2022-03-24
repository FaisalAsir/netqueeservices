package com.example.demo;

import com.example.demo.countries.Countries;
import com.example.demo.countries.CountriesSevice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;

@SpringBootApplication
@EnableWebMvc
public class DemoApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(DemoApplication.class, args);

		CountriesSevice countriesSevice = configurableApplicationContext.getBean(CountriesSevice.class);

		countriesSevice.saveCounties(Arrays.asList(new Countries("Bogor"),new Countries("Jakarta"),new Countries("Subang")));

	}

}


