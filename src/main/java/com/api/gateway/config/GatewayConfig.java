package com.api.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("dev_mario", r -> r.path("/api/grupos-proveedores/**")
                        .filters(f -> f.rewritePath("/api/grupos-proveedores/(?<segment>.*)", "/${segment}"))
                        .uri("https://6af8-38-25-4-47.ngrok-free.app"))
                .build();
    }
}
