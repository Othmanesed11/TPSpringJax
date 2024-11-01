package com.example.TPSpring.configur;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.example.TPSpring.rest");
        register(CompteListMessage.class);
    }
}