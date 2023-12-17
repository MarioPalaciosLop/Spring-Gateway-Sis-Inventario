# API Gateway

## Integrantes

1. Olivares Guzman Cristhain
2. Palacios Lopez Mario 
3. Paz Monteza Antonio
4. Saavedra Moscoso Cristopher
5. Zurita Jimenez Nancy

## Descripción

Este código configura un API Gateway utilizando Spring Cloud Gateway. Un API Gateway actúa como un punto de entrada único a un sistema de microservicios. En este caso, el API Gateway redirige las solicitudes a diferentes microservicios basándose en la ruta de la solicitud.

Los microservicios son:

1. **Empleados**: Todas las solicitudes que comienzan con `/api/empleados` serán redirigidas al servicio de empleados en la URL `https://f880-132-184-129-91.ngrok.io/**`.
2. **Compras**: Las solicitudes que comienzan con `/api/carritoCompra` serán redirigidas al servicio de compras en la URL `https://ec9c-170-81-241-210.ngrok.io/**`.
3. **Proveedores**: Las solicitudes que comienzan con `/api/grupos-proveedores` serán redirigidas al servicio de proveedores en la URL `https://0bb7-38-25-4-47.ngrok-free.app/**`.
4. **Productos**: Las solicitudes que comienzan con `/api/productos` serán redirigidas al servicio de productos en la URL especificada en `serv_productos`.
5. **Usuarios**: Las solicitudes que comienzan con `/api/usuarios` serán redirigidas al servicio de usuarios en la URL especificada en `serv_usuarios`.
