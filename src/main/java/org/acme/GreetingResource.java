package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/hello")
public class GreetingResource {

    private static final Logger log = Logger.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        log.info("Este es un registro de prueba enviado a Fluent Bit.");
        log.debug("Este es otro registro de prueba enviado a Fluent Bit.");
        log.warn("Este es otro registro de prueba enviado a Fluent Bit.");
        log.error("Este es otro registro de prueba enviado a Fluent Bit.");
        return "Hello from RESTEasy Reactive";
    }
}
