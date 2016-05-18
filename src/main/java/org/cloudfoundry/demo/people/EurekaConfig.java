package org.cloudfoundry.demo.people;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("eureka")
@EnableDiscoveryClient
public class EurekaConfig {

	
}
