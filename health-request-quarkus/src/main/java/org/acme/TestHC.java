package org.acme;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Liveness
public class TestHC implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("test");
    }
}
