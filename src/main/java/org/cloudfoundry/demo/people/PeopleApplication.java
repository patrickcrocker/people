package org.cloudfoundry.demo.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PeopleApplication {

	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}

	public static void main(String[] args) {
		SpringApplication.run(PeopleApplication.class, args);
	}
}
