package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.stereotype.Component;


@Configuration
public class SpringConfigurations {
	
	@Bean
	public RmiServiceExporter rmiExporter(SpitterService spitterService) {
		RmiServiceExporter rmiExporter = new RmiServiceExporter();
		rmiExporter.setService(spitterService);
		rmiExporter.setServiceName("SpitterService");
		rmiExporter.setServiceInterface(SpitterService.class);
		//rmiExporter.setRegistryHost("localhost");
		//rmiExporter.setRegistryPort(1199);
		return rmiExporter;
		//hello there
	}
	
	

}



