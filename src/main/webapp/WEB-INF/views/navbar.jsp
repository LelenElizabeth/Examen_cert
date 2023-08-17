<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<!-- Iconos Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>
<header>

	<!-- Navbar del sitio -->
<nav class="navbar navbar-expand-md fixed-top" style="background-color: #17a2b8;">
  <!-- Navbar content -->
  		<div class="container-fluid">
			<!-- Logo y nombre del sitio -->
			<a class="navbar-brand text-white" href="#"> <i class="bi bi-hospital text-white"></i>
				Gestor Clínica</a>

			<!-- boton del menu  -->
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#menu"
				aria-controls="navbarNavAltMarkup" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<!-- elementos del menu colapsable -->
			<div class="collapse navbar-collapse" id="menu">
				<ul class="navbar-nav me-auto">
					<li class="nav-item ms-2"><a
						class="nav-link text-white ${navItem == 'Inicio' ? 'active' : ''}"
						href="Inicio"> <i class="bi bi-house"></i> Inicio
					</a></li>
					 
					    <li class="nav-item dropdown ms-2">
					        <a class="nav-link dropdown-toggle text-white ${navItem == 'Listar' ? 'active' : ''}"
					           id="navbarDropdown" role="button" data-bs-toggle="dropdown" href="#">
					           <i class="bi bi-card-list"></i> Listar
					        </a>
					        <ul class="dropdown-menu">
					            <li><a class="dropdown-item" href="ListarPacientes"> <i class="bi bi-card-list"></i> Listado de Pacientes</a></li>
					        </ul>					        
					    </li>
				</ul>
				<form class="d-flex row justify-content-end ms-2" role="search">
        			<input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar">
        			<button class="btn btn-white" type="submit">Buscar</button>
      			</form> 
			</div>
		</div>
</nav>
</header>

