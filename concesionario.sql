-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-11-2025 a las 21:48:21
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `concesionario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `ideCliente` varchar(15) NOT NULL,
  `nombreCliente` varchar(100) NOT NULL,
  `direccionCliente` varchar(80) NOT NULL,
  `telefonoCliente` varchar(20) NOT NULL,
  `activo` varchar(5) DEFAULT 'true'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `codFactura` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `ideCliente` varchar(15) NOT NULL,
  `activo` varchar(5) DEFAULT 'true'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `placa` varchar(6) NOT NULL,
  `modelo` varchar(4) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `valor` int(11) NOT NULL,
  `activo` varchar(5) DEFAULT 'true'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculofactura`
--

CREATE TABLE `vehiculofactura` (
  `codFactura` int(11) NOT NULL,
  `placa` varchar(6) NOT NULL,
  `valorVenta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ideCliente`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`codFactura`),
  ADD KEY `pkFactura` (`ideCliente`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`placa`);

--
-- Indices de la tabla `vehiculofactura`
--
ALTER TABLE `vehiculofactura`
  ADD PRIMARY KEY (`codFactura`,`placa`),
  ADD KEY `placa` (`placa`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `pkFactura` FOREIGN KEY (`ideCliente`) REFERENCES `cliente` (`ideCliente`);

--
-- Filtros para la tabla `vehiculofactura`
--
ALTER TABLE `vehiculofactura`
  ADD CONSTRAINT `vehiculofactura_ibfk_1` FOREIGN KEY (`codFactura`) REFERENCES `factura` (`codFactura`),
  ADD CONSTRAINT `vehiculofactura_ibfk_2` FOREIGN KEY (`placa`) REFERENCES `vehiculo` (`placa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
