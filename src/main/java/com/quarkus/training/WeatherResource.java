package com.quarkus.training;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.ExampleObject;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/weather")
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class WeatherResource {

    @GET
    @Path("/hello")
    @Operation(
        summary = "Get hello msg",
        description = "Return hello message from Weather API"
    )
    @APIResponse(
        responseCode = "200",
        description = "Return hello message",
        content = @Content(
            mediaType = "text/plain",
            examples = @ExampleObject(
                name = "helloExample",
                value = "Hello from Weather API"
            )
        )
    )
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Weather API";
    }   
}
