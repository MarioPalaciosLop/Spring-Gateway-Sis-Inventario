package com.api.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

	String url_mario = "https://6af8-38-25-4-47.ngrok-free.app";
	
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("dev_nancy", r -> r.path("/api/empleados/**")
                        .uri("https://f880-132-184-129-91.ngrok.io"))
                .route("dev_antonio", r -> r.path("/api/carritoCompra/**")
                        .uri("https://ec9c-170-81-241-210.ngrok.io"))
                .route("dev_mario", r -> r.path("/api/grupos-proveedores/**")
                        .uri(url_mario))
                .build();
    }
}
