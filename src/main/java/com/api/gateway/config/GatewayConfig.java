package com.api.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

	String serv_proveedores   = "https://0bb7-38-25-4-47.ngrok-free.app/**";
	String serv_compras = "https://ec9c-170-81-241-210.ngrok.io/**";
	String serv_empleados   = "https://f880-132-184-129-91.ngrok.io/**";
        String serv_productos = " ";
        String serv_usuarios = " ";
	
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("empleados", r -> r.path("/api/empleados")
                        .uri(serv_empleados))
                .route("compras", r -> r.path("/api/carritoCompra")
                        .uri(serv_compras))
                .route("proveedores", r -> r.path("/api/grupos-proveedores")
                        .uri(serv_proveedores))
                .route("productos", r -> r.path("/api/productos")
                        .uri(serv_productos))
                .route("usuarios", r -> r.path("/api/usuarios")
                        .uri(serv_usuarios))
                .build();
    }
}
