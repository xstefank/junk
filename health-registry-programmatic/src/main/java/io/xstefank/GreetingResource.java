package io.xstefank;

import io.smallrye.health.api.HealthRegistry;
import io.smallrye.health.registry.HealthRegistries;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        HealthRegistry myHealthGroup = HealthRegistries.getHealthGroupRegistry("my-health-group");
        myHealthGroup.register(() -> HealthCheckResponse.up("test-hc"));

        return "Hello from RESTEasy Reactive";
    }
}