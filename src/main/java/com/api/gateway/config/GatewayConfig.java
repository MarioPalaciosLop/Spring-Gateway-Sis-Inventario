package com.api.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

	String url_mario = "https://1674-38-25-4-47.ngrok-free.app";
	String url_antonio = "https://18ba-170-81-241-210.ngrok.io";
	String url_nancy = "https://a4b1-132-184-129-91.ngrok.io";
	String url_olivares = "https://22cd-38-56-218-30.ngrok.io";
	String url_saavedra = "https://262e-181-67-205-36.ngrok.io";
	
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("dev_nancy", r -> r.path("/api/empleados/**")
                        .uri(url_nancy))
                .route("dev_antonio", r -> r.path("/api/carritoCompra/**")
                        .uri(url_antonio))
                .route("dev_mario", r -> r.path("/api/grupos-proveedores/**")
                        .uri(url_mario))
                .route("dev_olivares", r -> r.path("/api/productos/**")
                        .uri(url_olivares))
                .route("dev_saavedra", r -> r.path("/api/usuarios/**")
                        .uri(url_saavedra))
                .build();
    }
}
