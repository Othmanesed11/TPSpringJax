package com.example.TPSpring.configur;

import com.example.TPSpring.rest.CompteRestTPSpringapi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigur {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestTPSpringapi.class);
        return jerseyServlet;
    }
}