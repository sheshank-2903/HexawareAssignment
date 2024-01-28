package com.hexaware.aos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.hexaware.aos.*")
@EnableAspectJAutoProxy
public class AppConfig {
	
}
