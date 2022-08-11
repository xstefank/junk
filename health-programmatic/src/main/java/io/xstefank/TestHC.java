package io.xstefank;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;


public class TestHC implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("test");
    }
}
