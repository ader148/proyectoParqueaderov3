-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 25-06-2020 a las 16:21:41
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `parqueadero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(11) NOT NULL,
  `cargo` varchar(200) NOT NULL,
  `usuario_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parqueadero`
--

CREATE TABLE `parqueadero` (
  `id_parqueadero` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefonos` varchar(200) NOT NULL,
  `puestos_totales` int(11) NOT NULL,
  `puestos_ocupados` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `parqueadero`
--

INSERT INTO `parqueadero` (`id_parqueadero`, `nombre`, `direccion`, `telefonos`, `puestos_totales`, `puestos_ocupados`) VALUES
(1, 'Parqueadero El payaness', 'carrera 1 numero 25-84', '3174554377', 15, 10),
(2, 'Parqueadero Economico', 'calle falsa 123', '3174554377 - 3127653058', 22, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifa`
--

CREATE TABLE `tarifa` (
  `id_tarifa` int(11) NOT NULL,
  `tipo_tarifa` varchar(80) NOT NULL,
  `tipo_vehiculo` int(1) NOT NULL,
  `valor` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tarifa`
--

INSERT INTO `tarifa` (`id_tarifa`, `tipo_tarifa`, `tipo_vehiculo`, `valor`) VALUES
(1, 'hora_diurna', 1, 1750),
(2, 'hora_nocturna', 1, 2500),
(3, 'hora_diurna', 2, 1500),
(4, 'hora_nocturna', 2, 2000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `id_ticket` int(11) NOT NULL,
  `hora_entrada` datetime NOT NULL,
  `hora_salida` datetime DEFAULT NULL,
  `codigo` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`id_ticket`, `hora_entrada`, `hora_salida`, `codigo`) VALUES
(3, '2020-06-13 11:03:48', '0000-06-19 11:34:09', 1231233),
(41, '2020-06-16 01:21:34', '1899-12-31 00:00:00', 433123),
(42, '2020-06-16 01:24:52', '1899-12-31 00:00:00', 253423),
(43, '2020-06-16 01:31:55', '1899-12-31 00:00:00', 553133),
(44, '2020-06-16 01:32:24', '1899-12-31 00:00:00', 423233),
(45, '2020-06-16 01:32:38', '1899-12-31 00:00:00', 833233),
(46, '2020-06-16 23:07:38', '1899-12-31 00:00:00', -279019290),
(47, '2020-06-16 23:17:24', '1899-12-31 00:00:00', 423713),
(48, '2020-06-16 23:30:31', '1899-12-31 00:00:00', 133033),
(49, '2020-06-16 23:52:47', '1899-12-31 00:00:00', 743253),
(50, '2020-06-18 08:51:53', '1899-12-31 00:00:00', 353153),
(51, '2020-06-18 10:56:40', '1899-12-31 00:00:00', 43653),
(52, '2020-06-25 09:09:44', '1899-12-31 00:00:00', 443903);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_identificacion`
--

CREATE TABLE `tipo_identificacion` (
  `id_tipo_identificacion` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_vehiculo`
--

CREATE TABLE `tipo_vehiculo` (
  `id_tipo_vehiculo` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_vehiculo`
--

INSERT INTO `tipo_vehiculo` (`id_tipo_vehiculo`, `nombre`) VALUES
(1, 'Carro'),
(2, 'Moto'),
(3, 'Camion'),
(4, 'Furgon');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuario`
--

CREATE TABLE `Usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombres` varchar(150) NOT NULL,
  `apellidos` varchar(150) NOT NULL,
  `telefono` varchar(80) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `role_id` int(11) NOT NULL,
  `email` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `parqueadero_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Usuario`
--

INSERT INTO `Usuario` (`id_usuario`, `nombres`, `apellidos`, `telefono`, `direccion`, `role_id`, `email`, `password`, `parqueadero_id`) VALUES
(1, 'Alvaro', 'Erazo', '3174554377', 'calle 123', 1, 'ader148@hotmail.com', '123', 1),
(2, 'Pedro Jose', 'Muñoz', '7280770', 'calle 123 carrera 345', 1, 'jose@hotmail.com', '12345', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `placa` varchar(100) NOT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `tipo_vehiculo` int(100) NOT NULL,
  `marca` varchar(100) DEFAULT NULL,
  `color` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`placa`, `modelo`, `tipo_vehiculo`, `marca`, `color`) VALUES
('ABB-123', '2020', 1, 'mazda', 'negro'),
('ABC-123', 'null', 1, 'null', 'null'),
('AEC-123', '2020', 0, 'mazda', 'negro'),
('BBB-123', 'null', 1, 'null', 'null'),
('BBB-345', 'null', 1, 'null', 'null'),
('BBC-345', 'null', 1, 'null', 'null'),
('BBF-365', 'null', 1, 'null', 'null'),
('DDD-456', 'null', 1, 'null', 'null'),
('HCF-123', 'null', 1, 'null', 'null'),
('HHH-666', 'null', 1, 'null', 'null'),
('OPT-666', 'null', 1, 'null', 'null'),
('OPT-777', 'null', 1, 'null', 'null'),
('PPP-444', 'null', 1, 'null', 'null'),
('TTT-123', 'null', 1, 'null', 'null'),
('WWW-123', 'null', 1, 'null', 'null'),
('ZZZ-345', 'null', 1, 'null', 'null'),
('ZZZ-999', 'null', 1, 'null', 'null');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo_ticket`
--

CREATE TABLE `vehiculo_ticket` (
  `id` int(11) NOT NULL,
  `vehiculo_id` varchar(11) NOT NULL,
  `ticket_id` int(11) NOT NULL,
  `created_at` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vehiculo_ticket`
--

INSERT INTO `vehiculo_ticket` (`id`, `vehiculo_id`, `ticket_id`, `created_at`) VALUES
(7, '0sdfsdf', 0, NULL),
(8, '0', 0, NULL),
(9, '2', 3, '2020-06-16 18:36:15'),
(10, '5', 5, NULL),
(11, '6', 6, NULL),
(12, 'ABC-123', 3, NULL),
(13, 'ZZZ-999', 48, NULL),
(14, 'DDD-456', 49, NULL),
(15, 'WWW-123', 50, NULL),
(16, 'HCF-123', 51, NULL),
(17, 'OPT-666', 52, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `parqueadero`
--
ALTER TABLE `parqueadero`
  ADD PRIMARY KEY (`id_parqueadero`);

--
-- Indices de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  ADD PRIMARY KEY (`id_tarifa`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id_ticket`);

--
-- Indices de la tabla `tipo_identificacion`
--
ALTER TABLE `tipo_identificacion`
  ADD PRIMARY KEY (`id_tipo_identificacion`);

--
-- Indices de la tabla `tipo_vehiculo`
--
ALTER TABLE `tipo_vehiculo`
  ADD PRIMARY KEY (`id_tipo_vehiculo`);

--
-- Indices de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`placa`(30));

--
-- Indices de la tabla `vehiculo_ticket`
--
ALTER TABLE `vehiculo_ticket`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `parqueadero`
--
ALTER TABLE `parqueadero`
  MODIFY `id_parqueadero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  MODIFY `id_tarifa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
  MODIFY `id_ticket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT de la tabla `tipo_identificacion`
--
ALTER TABLE `tipo_identificacion`
  MODIFY `id_tipo_identificacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_vehiculo`
--
ALTER TABLE `tipo_vehiculo`
  MODIFY `id_tipo_vehiculo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vehiculo_ticket`
--
ALTER TABLE `vehiculo_ticket`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
