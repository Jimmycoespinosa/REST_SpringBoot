-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-03-2024 a las 21:49:59
-- Versión del servidor: 8.0.35-0ubuntu0.20.04.1
-- Versión de PHP: 7.4.3-4ubuntu2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ci4`
--
CREATE DATABASE `db_spring_crud`;
USE `db_spring_crud`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `created_at`, `update_at`, `deleted_at`) VALUES
(6, 'Andreita Espinosa', 'andreita@gmail.com', '2023-02-13 14:36:54', '2023-02-13 14:36:54', NULL),
(7, 'Katuchis', 'katha@yahoo.com', '2023-02-13 14:37:10', '2023-02-15 18:53:32', NULL),
(8, 'Juan David', 'david@gmail.com', '2023-02-13 14:37:27', '2023-02-13 14:37:27', NULL),
(9, 'Saul', 'saul@gmail.com', '2023-02-14 18:49:35', '2023-02-14 18:49:35', NULL),
(10, 'Lucila', 'lucila@gmail.com', '2023-02-14 18:51:12', '2023-02-14 18:51:12', NULL),
(11, 'Shannita', 'shana@gmail.com', '2023-02-14 20:12:42', '2023-02-14 20:12:42', NULL),
(12, 'Tommy', 'tommy@gmail.com', '2023-02-14 20:14:00', '2023-02-14 20:14:00', NULL),
(13, 'Guizmo', 'guizmo@hotmail.com', '2023-02-14 20:14:40', '2023-02-14 20:14:40', NULL),
(14, 'Jimmyco', 'jimmycoespinosa@gmail.com', '2023-02-15 20:59:58', '2023-02-15 20:59:58', NULL),
(15, 'Tonny', 'tonny@gmail.com', '2023-02-16 11:39:18', '2023-02-16 11:39:18', NULL),
(16, 'Test', 'test@gmail.com', '2023-02-16 11:39:40', '2023-02-16 11:39:40', NULL),
(17, 'Test2', 'Test2@gmail.com', '2023-02-16 13:54:33', '2023-02-16 13:54:33', NULL),
(18, 'Gustavo Uribe', 'gusuribe@gmail.com', '2024-02-25 19:11:43', '2024-02-25 19:11:43', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
