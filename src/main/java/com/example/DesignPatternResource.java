package com.example;

import org.jboss.resteasy.annotations.Body;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/design-patterns/creational")
public class DesignPatternResource {

    @GET
    @Path("/builder")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBookWithBuilder(){
        return new Book.Builder(1L)
                .withName("Moby Dick")
                .withAuthor("Herman Melville")
                .withIsbn("adasd123da1")
                .withGenre("Adventure")
                .build();
    }

    @GET
    @Path("/singleton")
    @Produces(MediaType.TEXT_PLAIN)
    public String logMessage( String message) {

        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.logMessage(message);

        return message;
    }



}
