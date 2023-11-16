package com.spring.SerivceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer       // for enable the eureka server
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
      
               // this is the configuration for Eureka service registry
//eureka:  
//	  instance:
//	    hostname: loaclhost            //host name(you can give any)
//	  client:                    
//	    register-with-eureka: false    //Not to register service registry itself as a client : false
//	    fetch-registry: false
//	    
//	server:
//	  port: 8761                        //by default port number of eureka server is 8761
//	  
	  