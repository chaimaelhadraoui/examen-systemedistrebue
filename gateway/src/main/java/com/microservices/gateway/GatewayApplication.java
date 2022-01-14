package com.microservices.gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator  (ReactiveDiscoveryClient discoveryClient, DiscoveryLocatorProperties properties){
        return new DiscoveryClientRouteDefinitionLocator(discoveryClient, properties);
    }


    @Autowired
    DiscoveryClient discoveryClient;


    @PostConstruct
    public void postContextConstruct() {
        System.out.println("application context started");

        System.out.println("*************** Discovery clients services ***************");
        discoveryClient.getServices().forEach(service -> {
            System.out.println("Service: " + service);

            System.out.println("Instances for "+service);
            discoveryClient.getInstances(service).forEach(instance -> {
                System.out.println("Uri: "+instance.getUri()+", ServiceId: "+instance.getServiceId());

            });

        });

    }
}
