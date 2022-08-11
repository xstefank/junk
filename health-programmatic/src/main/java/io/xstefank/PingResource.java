package io.xstefank;

import io.smallrye.health.api.HealthType;
import io.smallrye.health.registry.HealthRegistries;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("ping")
public class PingResource {


    @GET
    public Response ping() {
        HealthRegistries.getRegistry(HealthType.LIVENESS).register(new TestHC());
        return Response.ok("Application deployed successfully").build();
    }
}
