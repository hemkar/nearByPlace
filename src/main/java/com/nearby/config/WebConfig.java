package com.nearby.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.nearby.*")
public class WebConfig {

	//This class is used only for providing component scanning and enabling webMVC related configuration.
	//Make note that we don't have any view resolver as we don't need one in REST API.
}
