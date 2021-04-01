<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Usuario</title>
	
<!-- BootStrap -->
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<!-- BootStrap fin -->

	<style type="text/css">
		<%@ include file="css/estilo.css" %>
	</style>

</head>


<body>

	<%@ include file='menu/menu.jsp' %>
	
	<% 
	
	Boolean mostrarEliminarUsuarioEnJsp =  (Boolean) request.getAttribute("mostrarEliminarUsuarioEnJsp");
	Boolean mostrarEliminarUsuario1EnJsp =  (Boolean) request.getAttribute("mostrarEliminarUsuario1EnJsp");
	Boolean mostrarEliminarUsuario2EnJsp =  (Boolean) request.getAttribute("mostrarEliminarUsuario2EnJsp");
	Boolean mostrarEliminarUsuario3EnJsp =  (Boolean) request.getAttribute("mostrarEliminarUsuario3EnJsp");
	
	%>
 

 	<br>
	<section>

		<h1 class="tituloPrincipal">Eliminar Usuario</h1>

		<div class="contenido" style="text-align:center; font-weight: bold;">
		
			<%= mostrarEliminarUsuarioEnJsp %> Error: Tiene capacitaciones asociadas
			<br>
			<br>
			<%= mostrarEliminarUsuario1EnJsp %>
			<br>
			<br>
			<%= mostrarEliminarUsuario2EnJsp %>
			<br>
			<br>
			<%= mostrarEliminarUsuario3EnJsp %>
 			<br>
			<br>
 
			
			<input type="button" onclick="location.href='ListadoUsuarios';" value="Volver">

		</div>

	</section>
	
	
	
<!-- BootStrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
		integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
		integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
		crossorigin="anonymous"></script>
<!-- BootStrap fin -->
 
</body>
</html>