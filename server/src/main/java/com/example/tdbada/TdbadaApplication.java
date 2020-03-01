package com.example.tdbada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableAsync
@EnableCaching
public class TdbadaApplication {
///// TODO   http://localhost:9090/swagger-ui.html#/     SWAGGER

	public static void main(String[] args) {
		SpringApplication.run(TdbadaApplication.class, args);
	}


    @Autowired
    private Environment env;

	@Bean Map<String, String> getMap(){
        Map<String, String> urlMap = new HashMap<String, String>();
        urlMap.put("mongo", env.getProperty("mongo.url"));
        urlMap.put("couchdb", env.getProperty("couchdb.url"));
        urlMap.put("neo4j", env.getProperty("neo4j.url"));
        urlMap.put("cassandra", env.getProperty("cassandra.url"));
        urlMap.put("redis", env.getProperty("redis.url"));
        urlMap.put("firebase", env.getProperty("firebase.url"));
        urlMap.put("projetvoldemort", env.getProperty("projetvoldemort.url"));
        return urlMap;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }

}
