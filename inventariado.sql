-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2023 a las 03:15:12
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventariado`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion`
--

CREATE TABLE `asignacion` (
  `id_asignacion` bigint(20) NOT NULL,
  `id_desktop` bigint(20) DEFAULT NULL,
  `id_laptop` bigint(20) DEFAULT NULL,
  `id_pantalla` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asignacion`
--

INSERT INTO `asignacion` (`id_asignacion`, `id_desktop`, `id_laptop`, `id_pantalla`) VALUES
(1, 1, 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `desktop`
--

CREATE TABLE `desktop` (
  `id_desktop` bigint(20) NOT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `desktop`
--

INSERT INTO `desktop` (`id_desktop`, `modelo`, `nombre`) VALUES
(1, 'yjuyk1', '12154'),
(2, 'OptiPlex 3070', '12V9243'),
(3, 'OptiPlex 3070', '12ZBS33'),
(4, 'OptiPlex 3060', 'CHJ2DV2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laptop`
--

CREATE TABLE `laptop` (
  `id_laptop` bigint(20) NOT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `laptop`
--

INSERT INTO `laptop` (`id_laptop`, `modelo`, `nombre`) VALUES
(3, 'fjrsdtfhbfryh', '546514584'),
(4, 'Latitude 3390 2-in-1', '873QMT2'),
(6, 'Latitude 5490 ', '57YF8S2'),
(7, 'OptiPlex 3070', '23ZFH63');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pantalla`
--

CREATE TABLE `pantalla` (
  `id_pantalla` bigint(20) NOT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pantalla`
--

INSERT INTO `pantalla` (`id_pantalla`, `modelo`, `nombre`) VALUES
(1, 'mih7', '154651251'),
(3, 'DELL E2220H', '3Y33K13'),
(4, 'DELL E1916H', 'XJ5TR96BA3AB');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_persona` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `id_asignacion` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_persona`, `apellido`, `nombre`, `id_asignacion`) VALUES
(3, 'Gomez', 'Lady', NULL),
(4, 'Calvo', 'Juan', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD PRIMARY KEY (`id_asignacion`),
  ADD KEY `FKs11g15dq9nxchr0mdvr17npl0` (`id_desktop`),
  ADD KEY `FKjhd13dlqwr7hdi8wvnxofq9ha` (`id_laptop`),
  ADD KEY `FKkseua74d7qcywhji3rs0mv1b6` (`id_pantalla`);

--
-- Indices de la tabla `desktop`
--
ALTER TABLE `desktop`
  ADD PRIMARY KEY (`id_desktop`);

--
-- Indices de la tabla `laptop`
--
ALTER TABLE `laptop`
  ADD PRIMARY KEY (`id_laptop`);

--
-- Indices de la tabla `pantalla`
--
ALTER TABLE `pantalla`
  ADD PRIMARY KEY (`id_pantalla`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_persona`),
  ADD KEY `FKatvniw3vqe6dd7sic3vmglut4` (`id_asignacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  MODIFY `id_asignacion` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `desktop`
--
ALTER TABLE `desktop`
  MODIFY `id_desktop` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `laptop`
--
ALTER TABLE `laptop`
  MODIFY `id_laptop` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pantalla`
--
ALTER TABLE `pantalla`
  MODIFY `id_pantalla` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id_persona` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD CONSTRAINT `FKjhd13dlqwr7hdi8wvnxofq9ha` FOREIGN KEY (`id_laptop`) REFERENCES `laptop` (`id_laptop`),
  ADD CONSTRAINT `FKkseua74d7qcywhji3rs0mv1b6` FOREIGN KEY (`id_pantalla`) REFERENCES `pantalla` (`id_pantalla`),
  ADD CONSTRAINT `FKs11g15dq9nxchr0mdvr17npl0` FOREIGN KEY (`id_desktop`) REFERENCES `desktop` (`id_desktop`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `FKatvniw3vqe6dd7sic3vmglut4` FOREIGN KEY (`id_asignacion`) REFERENCES `asignacion` (`id_asignacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
