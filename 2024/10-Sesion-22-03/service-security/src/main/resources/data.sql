-- Usar base de datos
USE service_security;

-- Insert en role
INSERT INTO role (`name`, `description`, `state`, `created_at`, `created_by`) VALUES
('Administrador del sistema', 'Descripción del Administrador del sistema', true, now(), 1),
('Gerente de ventas', 'Descripción del Gerente de ventas', true, now(), 1),
('Editor de contenido', 'Descripción del Editor de contenido', true, now(), 1),
('Analista de datos', 'Descripción del Analista de datos', true, now(), 1),
('Representante de servicio al cliente', 'Descripción del Representante de servicio al cliente', true, now(), 1),
('Desarrollador de software', 'Descripción del Desarrollador de software', true, now(), 1),
('Auditor de seguridad', 'Descripción del Auditor de seguridad', true, now(), 1),
('Supervisor de permisos', 'Descripción del Supervisor de permisos', true, now(), 1),
('Especialista en integraciones', 'Descripción del Especialista en integraciones', true, now(), 1),
('Usuario estándar', 'Descripción del Usuario estándar', true, now(), 1);

-- Insert en module
INSERT INTO module (`name`, `description`, `route`, `state`, `created_at`, `created_by`) VALUES
('Gestión de usuarios', 'Descripción de Gestión de usuarios', '/usuarios', true, NOW(), 1),
('Administración de contenido', 'Descripción de Administración de contenido', '/contenido', true, NOW(), 1),
('Panel de control', 'Descripción de Panel de control', '/panel-control', true, NOW(), 1),
('Analíticas de datos', 'Descripción de Analíticas de datos', '/analiticas', true, NOW(), 1),
('Sistema de notificaciones', 'Descripción de Sistema de notificaciones', '/notificaciones', true, NOW(), 1),
('Gestión de permisos', 'Descripción de Gestión de permisos', '/permisos', true, NOW(), 1),
('Módulo de ventas', 'Descripción de Módulo de ventas', '/ventas', true, NOW(), 1),
('Servicio de atención al cliente', 'Descripción de Servicio de atención al cliente', '/atencion-cliente', true, NOW(), 1),
('Integración de terceros', 'Descripción de Integración de terceros', '/integracion-terceros', true, NOW(), 1),
('Herramientas de seguridad', 'Descripción de Herramientas de seguridad', '/seguridad', true, NOW(), 1);

-- Insert en view
INSERT INTO view (`name`, `description`, `route`, `state`, `created_at`, `created_by`) VALUES
('Inicio', 'Vista de Inicio', '/inicio', true, NOW(), 1),
('Perfil de Usuario', 'Vista del Perfil de Usuario', '/perfil', true, NOW(), 1),
('Configuración de Cuenta', 'Vista de Configuración de Cuenta', '/configuracion-cuenta', true, NOW(), 1),
('Administración de Usuarios', 'Vista de Administración de Usuarios', '/admin/usuarios', true, NOW(), 1),
('Crear Usuario', 'Vista de Creación de Usuario', '/admin/usuarios/crear', true, NOW(), 1),
('Editar Usuario', 'Vista de Edición de Usuario', '/admin/usuarios/editar', true, NOW(), 1),
('Eliminar Usuario', 'Vista de Eliminación de Usuario', '/admin/usuarios/eliminar', true, NOW(), 1),
('Administración de Roles', 'Vista de Administración de Roles', '/admin/roles', true, NOW(), 1),
('Crear Rol', 'Vista de Creación de Rol', '/admin/roles/crear', true, NOW(), 1),
('Editar Rol', 'Vista de Edición de Rol', '/admin/roles/editar', true, NOW(), 1),
('Eliminar Rol', 'Vista de Eliminación de Rol', '/admin/roles/eliminar', true, NOW(), 1),
('Panel de Control', 'Vista del Panel de Control', '/panel-control', true, NOW(), 1),
('Estadísticas de Ventas', 'Vista de Estadísticas de Ventas', '/panel-control/estadisticas-ventas', true, NOW(), 1),
('Informes de Ventas', 'Vista de Informes de Ventas', '/panel-control/informes-ventas', true, NOW(), 1),
('Configuración de Ventas', 'Vista de Configuración de Ventas', '/panel-control/configuracion-ventas', true, NOW(), 1),
('Gestión de Productos', 'Vista de Gestión de Productos', '/productos', true, NOW(), 1),
('Crear Producto', 'Vista de Creación de Producto', '/productos/crear', true, NOW(), 1),
('Editar Producto', 'Vista de Edición de Producto', '/productos/editar', true, NOW(), 1),
('Eliminar Producto', 'Vista de Eliminación de Producto', '/productos/eliminar', true, NOW(), 1),
('Catálogo de Productos', 'Vista del Catálogo de Productos', '/catalogo/productos', true, NOW(), 1),
('Detalles del Producto', 'Vista de Detalles del Producto', '/catalogo/productos/{id}', true, NOW(), 1),
('Carrito de Compras', 'Vista del Carrito de Compras', '/carrito-compras', true, NOW(), 1),
('Realizar Pedido', 'Vista de Realizar Pedido', '/realizar-pedido', true, NOW(), 1),
('Confirmación de Pedido', 'Vista de Confirmación de Pedido', '/confirmacion-pedido', true, NOW(), 1),
('Historial de Pedidos', 'Vista del Historial de Pedidos', '/historial-pedidos', true, NOW(), 1),
('Seguimiento de Pedidos', 'Vista de Seguimiento de Pedidos', '/seguimiento-pedidos', true, NOW(), 1),
('Soporte al Cliente', 'Vista de Soporte al Cliente', '/soporte', true, NOW(), 1),
('Crear Ticket de Soporte', 'Vista de Creación de Ticket de Soporte', '/soporte/crear', true, NOW(), 1),
('Ver Tickets de Soporte', 'Vista de Visualización de Tickets de Soporte', '/soporte/tickets', true, NOW(), 1),
('Detalles del Ticket', 'Vista de Detalles del Ticket', '/soporte/tickets/{id}', true, NOW(), 1),
('Responder Ticket de Soporte', 'Vista de Respuesta a Ticket de Soporte', '/soporte/tickets/{id}/responder', true, NOW(), 1),
('Administración de Contenido', 'Vista de Administración de Contenido', '/admin/contenido', true, NOW(), 1),
('Crear Entrada de Blog', 'Vista de Creación de Entrada de Blog', '/admin/contenido/crear', true, NOW(), 1),
('Editar Entrada de Blog', 'Vista de Edición de Entrada de Blog', '/admin/contenido/editar', true, NOW(), 1),
('Eliminar Entrada de Blog', 'Vista de Eliminación de Entrada de Blog', '/admin/contenido/eliminar', true, NOW(), 1),
('Lista de Entradas de Blog', 'Vista de Lista de Entradas de Blog', '/blog', true, NOW(), 1),
('Detalles de Entrada de Blog', 'Vista de Detalles de Entrada de Blog', '/blog/{id}', true, NOW(), 1),
('Comentarios de Entrada de Blog', 'Vista de Comentarios de Entrada de Blog', '/blog/{id}/comentarios', true, NOW(), 1),
('Crear Comentario', 'Vista de Creación de Comentario', '/blog/{id}/comentarios/crear', true, NOW(), 1),
('Editar Comentario', 'Vista de Edición de Comentario', '/blog/{id}/comentarios/{id}/editar', true, NOW(), 1),
('Eliminar Comentario', 'Vista de Eliminación de Comentario', '/blog/{id}/comentarios/{id}/eliminar', true, NOW(), 1),
('Gestión de Clientes', 'Vista de Gestión de Clientes', '/clientes', true, NOW(), 1),
('Detalles del Cliente', 'Vista de Detalles del Cliente', '/clientes/{id}', true, NOW(), 1),
('Crear Cliente', 'Vista de Creación de Cliente', '/clientes/crear', true, NOW(), 1),
('Editar Cliente', 'Vista de Edición de Cliente', '/clientes/editar', true, NOW(), 1),
('Eliminar Cliente', 'Vista de Eliminación de Cliente', '/clientes/eliminar', true, NOW(), 1),
('Facturación', 'Vista de Facturación', '/facturacion', true, NOW(), 1),
('Crear Factura', 'Vista de Creación de Factura', '/facturacion/crear', true, NOW(), 1),
('Ver Facturas', 'Vista de Visualización de Facturas', '/facturacion/ver', true, NOW(), 1),
('Detalles de Factura', 'Vista de Detalles de Factura', '/facturacion/{id}', true, NOW(), 1),
('Administración de Proveedores', 'Vista de Administración de Proveedores', '/admin/proveedores', true, NOW(), 1),
('Crear Proveedor', 'Vista de Creación de Proveedor', '/admin/proveedores/crear', true, NOW(), 1),
('Editar Proveedor', 'Vista de Edición de Proveedor', '/admin/proveedores/editar', true, NOW(), 1),
('Eliminar Proveedor', 'Vista de Eliminación de Proveedor', '/admin/proveedores/eliminar', true, NOW(), 1),
('Gestión de Inventarios', 'Vista de Gestión de Inventarios', '/inventarios', true, NOW(), 1),
('Crear Entrada de Inventario', 'Vista de Creación de Entrada de Inventario', '/inventarios/entrada', true, NOW(), 1),
('Crear Salida de Inventario', 'Vista de Creación de Salida de Inventario', '/inventarios/salida', true, NOW(), 1),
('Lista de Inventario', 'Vista de Lista de Inventario', '/inventarios/lista', true, NOW(), 1),
('Detalles del Producto en Inventario', 'Vista de Detalles del Producto en Inventario', '/inventarios/{id}', true, NOW(), 1),
('Configuración de Seguridad', 'Vista de Configuración de Seguridad', '/configuracion-seguridad', true, NOW(), 1),
('Configuración de Permisos', 'Vista de Configuración de Permisos', '/configuracion-permisos', true, NOW(), 1),
('Administración de Configuraciones', 'Vista de Administración de Configuraciones', '/admin/configuraciones', true, NOW(), 1),
('Configuración de Notificaciones', 'Vista de Configuración de Notificaciones', '/configuracion-notificaciones', true, NOW(), 1),
('Preferencias de Usuario', 'Vista de Preferencias de Usuario', '/preferencias', true, NOW(), 1),
('Configuración de Integraciones', 'Vista de Configuración de Integraciones', '/configuracion-integraciones', true, NOW(), 1),
('Configuración de API', 'Vista de Configuración de API', '/configuracion-api', true, NOW(), 1),
('Registro de Actividad', 'Vista de Registro de Actividad', '/registro-actividad', true, NOW(), 1),
('Registro de Acceso', 'Vista de Registro de Acceso', '/registro-acceso', true, NOW(), 1),
('Registro de Errores', 'Vista de Registro de Errores', '/registro-errores', true, NOW(), 1),
('Registro de Cambios', 'Vista de Registro de Cambios', '/registro-cambios', true, NOW(), 1),
('Configuración de Idioma', 'Vista de Configuración de Idioma', '/configuracion-idioma', true, NOW(), 1),
('Configuración de Tema', 'Vista de Configuración de Tema', '/configuracion-tema', true, NOW(), 1),
('Centro de Ayuda', 'Vista del Centro de Ayuda', '/ayuda', true, NOW(), 1),
('Documentación', 'Vista de Documentación', '/documentacion', true, NOW(), 1),
('FAQ (Preguntas Frecuentes)', 'Vista de Preguntas Frecuentes', '/faq', true, NOW(), 1),
('Políticas y Términos', 'Vista de Políticas y Términos', '/politicas-terminos', true, NOW(), 1),
('Contacto', 'Vista de Contacto', '/contacto', true, NOW(), 1),
('Solicitud de Demo', 'Vista de Solicitud de Demo', '/solicitud-demo', true, NOW(), 1),
('Página de Aviso Legal', 'Vista de Página de Aviso Legal', '/aviso-legal', true, NOW(), 1),
('Gestión de Suscripciones', 'Vista de Gestión de Suscripciones', '/suscripciones', true, NOW(), 1),
('Suscripción Mensual', 'Vista de Suscripción Mensual', '/suscripciones/mensual', true, NOW(), 1),
('Suscripción Anual', 'Vista de Suscripción Anual', '/suscripciones/anual', true, NOW(), 1),
('Facturación de Suscripción', 'Vista de Facturación de Suscripción', '/facturacion/suscripcion', true, NOW(), 1),
('Detalles de la Suscripción', 'Vista de Detalles de la Suscripción', '/suscripciones/{id}', true, NOW(), 1),
('Administración de Descuentos', 'Vista de Administración de Descuentos', '/admin/descuentos', true, NOW(), 1),
('Crear Descuento', 'Vista de Creación de Descuento', '/admin/descuentos/crear', true, NOW(), 1),
('Editar Descuento', 'Vista de Edición de Descuento', '/admin/descuentos/editar', true, NOW(), 1),
('Eliminar Descuento', 'Vista de Eliminación de Descuento', '/admin/descuentos/eliminar', true, NOW(), 1),
('Configuración de Impuestos', 'Vista de Configuración de Impuestos', '/configuracion-impuestos', true, NOW(), 1),
('Calculadora de Impuestos', 'Vista de Calculadora de Impuestos', '/calculadora-impuestos', true, NOW(), 1),
('Información de Impuestos', 'Vista de Información de Impuestos', '/informacion-impuestos', true, NOW(), 1),
('Centro de Integración', 'Vista del Centro de Integración', '/integracion', true, NOW(), 1),
('Documentación de API', 'Vista de Documentación de API', '/integracion/api-documentacion', true, NOW(), 1),
('Solicitar Clave de API', 'Vista de Solicitud de Clave de API', '/integracion/solicitar-api', true, NOW(), 1),
('Estadísticas de Integración', 'Vista de Estadísticas de Integración', '/integracion/estadisticas', true, NOW(), 1),
('Registro de Integración', 'Vista de Registro de Integración', '/integracion/registro', true, NOW(), 1),
('Información de Integración', 'Vista de Información de Integración', '/integracion/informacion', true, NOW(), 1),
('Gestión de Notificaciones', 'Vista de Gestión de Notificaciones', '/notificaciones', true, NOW(), 1),
('Centro de Integración nuevas', 'Vista del Centro de Integración v2', '/integracion-v2', true, NOW(), 1),
('Documentación de API nuevas', 'Vista de Documentación de API v2', '/integracion/api-documentacion-v2', true, NOW(), 1);


-- Insert en view_module
INSERT INTO module_view (`view_id`, `module_id`, `state`, `created_at`, `created_by`) VALUES
(1, 1, true, NOW(), 1), -- Inicio - Inicio
(2, 1, true, NOW(), 1), -- Perfil de Usuario - Gestión de usuarios
(3, 1, true, NOW(), 1), -- Configuración de Cuenta - Gestión de usuarios
(4, 1, true, NOW(), 1), -- Administración de Usuarios - Gestión de usuarios
(5, 1, true, NOW(), 1), -- Crear Usuario - Gestión de usuarios
(6, 1, true, NOW(), 1), -- Editar Usuario - Gestión de usuarios
(7, 1, true, NOW(), 1), -- Eliminar Usuario - Gestión de usuarios
(8, 6, true, NOW(), 1), -- Administración de Roles - Gestión de permisos
(9, 6, true, NOW(), 1), -- Crear Rol - Gestión de permisos
(10, 6, true, NOW(), 1), -- Editar Rol - Gestión de permisos
(11, 6, true, NOW(), 1), -- Eliminar Rol - Gestión de permisos
(12, 3, true, NOW(), 1), -- Panel de Control - Panel de control
(13, 3, true, NOW(), 1), -- Estadísticas de Ventas - Panel de control
(14, 3, true, NOW(), 1), -- Informes de Ventas - Panel de control
(15, 3, true, NOW(), 1), -- Configuración de Ventas - Panel de control
(16, 9, true, NOW(), 1), -- Gestión de Productos - Gestión de productos
(17, 9, true, NOW(), 1), -- Crear Producto - Gestión de productos
(18, 9, true, NOW(), 1), -- Editar Producto - Gestión de productos
(19, 9, true, NOW(), 1), -- Eliminar Producto - Gestión de productos
(20, 9, true, NOW(), 1), -- Catálogo de Productos - Gestión de productos
(21, 9, true, NOW(), 1), -- Detalles del Producto - Gestión de productos
(22, 7, true, NOW(), 1), -- Carrito de Compras - Módulo de ventas, Panel de control
(23, 7, true, NOW(), 1), -- Realizar Pedido - Módulo de ventas, Panel de control
(24, 7, true, NOW(), 1), -- Confirmación de Pedido - Módulo de ventas, Panel de control
(25, 7, true, NOW(), 1), -- Historial de Pedidos - Módulo de ventas, Panel de control
(26, 7, true, NOW(), 1), -- Seguimiento de Pedidos - Módulo de ventas, Panel de control
(27, 8, true, NOW(), 1), -- Soporte al Cliente - Servicio de atención al cliente
(28, 8, true, NOW(), 1), -- Crear Ticket de Soporte - Servicio de atención al cliente
(29, 8, true, NOW(), 1), -- Ver Tickets de Soporte - Servicio de atención al cliente
(30, 8, true, NOW(), 1), -- Detalles del Ticket - Servicio de atención al cliente
(31, 8, true, NOW(), 1), -- Responder Ticket de Soporte - Servicio de atención al cliente
(32, 4, true, NOW(), 1), -- Administración de Contenido - Administración de contenido
(33, 4, true, NOW(), 1), -- Crear Entrada de Blog - Administración de contenido
(34, 4, true, NOW(), 1), -- Editar Entrada de Blog - Administración de contenido
(35, 4, true, NOW(), 1), -- Eliminar Entrada de Blog - Administración de contenido
(36, 4, true, NOW(), 1), -- Lista de Entradas de Blog - Administración de contenido
(37, 4, true, NOW(), 1), -- Detalles de Entrada de Blog - Administración de contenido
(38, 4, true, NOW(), 1), -- Comentarios de Entrada de Blog - Administración de contenido
(39, 4, true, NOW(), 1), -- Crear Comentario - Administración de contenido
(40, 4, true, NOW(), 1), -- Editar Comentario - Administración de contenido
(41, 4, true, NOW(), 1), -- Eliminar Comentario - Administración de contenido
(42, 10, true, NOW(), 1), -- Gestión de Clientes - Gestión de clientes
(43, 10, true, NOW(), 1), -- Detalles del Cliente - Gestión de clientes
(44, 10, true, NOW(), 1), -- Crear Cliente - Gestión de clientes
(45, 10, true, NOW(), 1), -- Editar Cliente - Gestión de clientes
(46, 10, true, NOW(), 1), -- Eliminar Cliente - Gestión de clientes
(47, 2, true, NOW(), 1), -- Facturación - Facturación
(48, 2, true, NOW(), 1), -- Crear Factura - Facturación
(49, 2, true, NOW(), 1), -- Ver Facturas - Facturación
(50, 2, true, NOW(), 1), -- Detalles de Factura - Facturación
(51, 5, true, NOW(), 1), -- Administración de Proveedores - Gestión de proveedores
(52, 5, true, NOW(), 1), -- Crear Proveedor - Gestión de proveedores
(53, 5, true, NOW(), 1), -- Editar Proveedor - Gestión de proveedores
(54, 5, true, NOW(), 1), -- Eliminar Proveedor - Gestión de proveedores
(55, 8, true, NOW(), 1), -- Gestión de Inventarios - Gestión de inventarios
(56, 8, true, NOW(), 1), -- Crear Entrada de Inventario - Gestión de inventarios
(57, 8, true, NOW(), 1), -- Crear Salida de Inventario - Gestión de inventarios
(58, 8, true, NOW(), 1), -- Lista de Inventario - Gestión de inventarios
(59, 8, true, NOW(), 1), -- Detalles del Producto en Inventario - Gestión de inventarios
(60, 9, true, NOW(), 1), -- Configuración de Seguridad - Herramientas de seguridad
(61, 6, true, NOW(), 1), -- Configuración de Permisos - Gestión de permisos
(62, 9, true, NOW(), 1), -- Administración de Configuraciones - Herramientas de seguridad
(63, 9, true, NOW(), 1), -- Configuración de Notificaciones - Sistema de notificaciones
(64, 9, true, NOW(), 1), -- Preferencias de Usuario - Herramientas de seguridad
(65, 9, true, NOW(), 1), -- Configuración de Integraciones - Integración de terceros
(66, 9, true, NOW(), 1), -- Configuración de API - Integración de terceros
(67, 9, true, NOW(), 1), -- Registro de Actividad - Herramientas de seguridad
(68, 9, true, NOW(), 1), -- Registro de Acceso - Herramientas de seguridad
(69, 9, true, NOW(), 1), -- Registro de Errores - Herramientas de seguridad
(70, 9, true, NOW(), 1), -- Registro de Cambios - Herramientas de seguridad
(71, 9, true, NOW(), 1), -- Configuración de Idioma - Herramientas de seguridad
(72, 9, true, NOW(), 1), -- Configuración de Tema - Herramientas de seguridad
(73, 8, true, NOW(), 1), -- Centro de Ayuda - Soporte al cliente
(74, 10, true, NOW(), 1), -- Documentación - Centro de ayuda, Documentación
(75, 10, true, NOW(), 1), -- FAQ (Preguntas Frecuentes) - Centro de ayuda, Documentación
(76, 10, true, NOW(), 1), -- Políticas y Términos - Centro de ayuda, Documentación
(77, 8, true, NOW(), 1), -- Contacto - Centro de ayuda, Soporte al cliente
(78, 8, true, NOW(), 1), -- Solicitud de Demo - Centro de ayuda, Soporte al cliente
(79, 10, true, NOW(), 1), -- Página de Aviso Legal - Centro de ayuda, Documentación
(80, 9, true, NOW(), 1), -- Gestión de Suscripciones - Herramientas de seguridad
(81, 9, true, NOW(), 1), -- Suscripción Mensual - Herramientas de seguridad
(82, 9, true, NOW(), 1), -- Suscripción Anual - Herramientas de seguridad
(83, 9, true, NOW(), 1), -- Facturación de Suscripción - Herramientas de seguridad
(84, 9, true, NOW(), 1), -- Detalles de la Suscripción - Herramientas de seguridad
(85, 10, true, NOW(), 1), -- Administración de Descuentos - Gestión de ventas, Herramientas de seguridad
(86, 10, true, NOW(), 1), -- Crear Descuento - Gestión de ventas, Herramientas de seguridad
(87, 10, true, NOW(), 1), -- Editar Descuento - Gestión de ventas, Herramientas de seguridad
(88, 10, true, NOW(), 1), -- Eliminar Descuento - Gestión de ventas, Herramientas de seguridad
(89, 9, true, NOW(), 1), -- Configuración de Impuestos - Herramientas de seguridad
(90, 9, true, NOW(), 1), -- Calculadora de Impuestos - Herramientas de seguridad
(91, 9, true, NOW(), 1), -- Información de Impuestos - Herramientas de seguridad
(92, 9, true, NOW(), 1), -- Centro de Integración - Integración de terceros
(93, 10, true, NOW(), 1), -- Documentación de API - Integración de terceros
(94, 8, true, NOW(), 1), -- Solicitar Clave de API - Integración de terceros
(95, 10, true, NOW(), 1), -- Estadísticas de Integración - Integración de terceros
(96, 9, true, NOW(), 1), -- Registro de Integración - Integración de terceros
(97, 9, true, NOW(), 1), -- Información de Integración - Integración de terceros
(98, 9, true, NOW(), 1), -- Gestión de Notificaciones - Sistema de notificaciones
(99, 9, true, NOW(), 1), -- Configuración de Seguridad - Herramientas de seguridad
(100, 9, true, NOW(), 1); -- Configuración de Seguridad - Herramientas de seguridad


-- Insert en role_module
INSERT INTO module_role (`role_id`, `module_id`, `state`, `created_at`, `created_by`) VALUES
(1, 1, true, NOW(), 1), -- Administrador del sistema - Gestión de usuarios
(1, 2, true, NOW(), 1), -- Administrador del sistema - Administración de contenido
(1, 3, true, NOW(), 1), -- Administrador del sistema - Panel de control
(1, 4, true, NOW(), 1), -- Administrador del sistema - Analíticas de datos
(1, 5, true, NOW(), 1), -- Administrador del sistema - Sistema de notificaciones
(1, 6, true, NOW(), 1), -- Administrador del sistema - Gestión de permisos
(1, 7, true, NOW(), 1), -- Administrador del sistema - Módulo de ventas
(1, 8, true, NOW(), 1), -- Administrador del sistema - Servicio de atención al cliente
(1, 9, true, NOW(), 1), -- Administrador del sistema - Integración de terceros
(1, 10, true, NOW(), 1), -- Administrador del sistema - Herramientas de seguridad
(2, 1, true, NOW(), 1), -- Gerente de ventas - Gestión de usuarios
(2, 3, true, NOW(), 1), -- Gerente de ventas - Panel de control
(2, 7, true, NOW(), 1), -- Gerente de ventas - Módulo de ventas
(2, 8, true, NOW(), 1), -- Gerente de ventas - Servicio de atención al cliente
(2, 10, true, NOW(), 1), -- Gerente de ventas - Herramientas de seguridad
(3, 1, true, NOW(), 1), -- Editor de contenido - Gestión de usuarios
(3, 2, true, NOW(), 1), -- Editor de contenido - Administración de contenido
(3, 10, true, NOW(), 1), -- Editor de contenido - Herramientas de seguridad
(4, 1, true, NOW(), 1), -- Analista de datos - Gestión de usuarios
(4, 4, true, NOW(), 1), -- Analista de datos - Analíticas de datos
(4, 10, true, NOW(), 1), -- Analista de datos - Herramientas de seguridad
(5, 1, true, NOW(), 1), -- Representante de servicio al cliente - Gestión de usuarios
(5, 8, true, NOW(), 1), -- Representante de servicio al cliente - Servicio de atención al cliente
(5, 10, true, NOW(), 1), -- Representante de servicio al cliente - Herramientas de seguridad
(6, 1, true, NOW(), 1), -- Desarrollador de software - Gestión de usuarios
(6, 6, true, NOW(), 1), -- Desarrollador de software - Gestión de permisos
(6, 10, true, NOW(), 1), -- Desarrollador de software - Herramientas de seguridad
(7, 1, true, NOW(), 1), -- Auditor de seguridad - Gestión de usuarios
(7, 6, true, NOW(), 1), -- Auditor de seguridad - Gestión de permisos
(7, 10, true, NOW(), 1), -- Auditor de seguridad - Herramientas de seguridad
(8, 1, true, NOW(), 1), -- Supervisor de permisos - Gestión de usuarios
(8, 6, true, NOW(), 1), -- Supervisor de permisos - Gestión de permisos
(8, 10, true, NOW(), 1), -- Supervisor de permisos - Herramientas de seguridad
(9, 1, true, NOW(), 1), -- Especialista en integraciones - Gestión de usuarios
(9, 9, true, NOW(), 1), -- Especialista en integraciones - Integración de terceros
(9, 10, true, NOW(), 1), -- Especialista en integraciones - Herramientas de seguridad
(10, 1, true, NOW(), 1), -- Usuario estándar - Gestión de usuarios
(10, 3, true, NOW(), 1), -- Usuario estándar - Panel de control
(10, 7, true, NOW(), 1), -- Usuario estándar - Módulo de ventas
(10, 8, true, NOW(), 1), -- Usuario estándar - Servicio de atención al cliente
(10, 10, true, NOW(), 1); -- Usuario estándar - Herramientas de seguridad