package org.example;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path(value = "/something")
public class AController {

    @ConfigProperty(name = "quarkus.mydb.invoked")
    String invoked;

    @Path(value = "/invoked")
    @GET
    public String test() {
        return invoked;
    }
}
