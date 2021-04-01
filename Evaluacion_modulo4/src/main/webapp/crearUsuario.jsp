<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>

<!-- BootStrap -->
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<!-- BootStrap fin -->

<!-- Jquery y Validate-->

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.js"></script>
<!-- Jquery y Validate - fin-->

	<script type="text/javascript">
	
	<%@ include file="js/validarUsuario.js" %>
	 
	</script>
	
	<style type="text/css">
		<%@ include file="css/estilo.css" %>
	</style>

</head>

<body>

	<%@ include file='menu/menu.jsp' %>
	
 	<br>
	<section>

		<h1 class="tituloPrincipal">Crear Usuario</h1>

		<div class="contenido formularios">

			<form action="FormCrearUsuario" method="post" id="formUsuario">

				<div class="label-input">
					<label for="runusuario" class="form-label">RUN* :</label> <input
						type="number" id="runusuario" name="runusuario">
				</div>

				<div class="label-input">
					<label for="usnombre" class="form-label">Nombre* :</label>
					<input type="text" id="usnombre" name="usnombre">
				</div>

				<div class="label-input">
					<label for="usapellido" class="form-label">Apellido* :</label>
					<input type="text" id="usapellido" name="usapellido">
				</div>

				<div class="label-input">
					<label for="usnacimiento" class="form-label">Fecha de Nacimiento* :</label> <input
						type="text" id="usnacimiento" name="usnacimiento">
				</div>
				
				<div class="label-input">
					<label for="fechaNacimiento" class="form-label">Tipo de usuario</label>
 
					<select id="perfil" name="perfil">
						<option value="0"></option>
						<option value="1">Cliente</option>
						<option value="2">Profesional</option>
						<option value="3">Administrativo</option>
					</select>
					
				</div>
				
				<div id="cliente" class="label-input">
					<h3>Datos de Cliente</h3>
		
					<label for="rutcliente" class="form-label">Rut Cliente:</label>
					<input type="number" id="rutcliente" name="rutcliente">
					
					<label for="clitelefono" class="form-label">Telefono:</label>
					<input type="text" id="clitelefono" name="clitelefono">
					
					<label for="cliafp" class="form-label">Afp:</label>
					<input type="text" id="cliafp" name="cliafp">
					
					<label for="clisistemasalud" class="form-label">Sistema de salud:</label>
					<select id="clisistemasalud" name="clisistemasalud">
						<option value="0"></option>
						<option value="1">Fonasa</option>
						<option value="2">Isapre</option>		 
					</select>
					 
					<label for="clidireccion" class="form-label">Direccion:</label>
					<input type="text" id="clidireccion" name="clidireccion">
					
					<label for="clicomuna" class="form-label">Comuna:</label>
					<input type="text" id="clicomuna" name="clicomuna">
					
					<label for="cliedad" class="form-label">Edad:</label>
					<input type="number" id="cliedad" name="cliedad">
 	 	 
 				</div>
 				
 				<div id="profesional" class="label-input">
					<h3>Datos de Profesional</h3>
					
					<label for="protelefono" class="form-label">Telefono :</label>
					<input type="text" id="protelefono" name="protelefono">
					
					<label for="protitulo" class="form-label">Titulo :</label>
					<input type="text" id="protitulo" name="protitulo">
					
					<label for="proproyecto" class="form-label">Proyecto :</label>
					<input type="text" id="proproyecto" name="proproyecto">
					
 				</div>
 				
 				<div id="administrativo" class="label-input">
					<h3>Datos de Administrativo</h3>
					
					<label for="adcorreo" class="form-label">Correo :</label>
					<input type="text" id="adcorreo" name="adcorreo">
					
					<label for="adarea" class="form-label">Area :</label>
					<input type="text" id="adarea" name="adarea">
 				 
 				</div>
 				
				<div class="label-input">
					<label for="nose" class="form-label">(*) Datos obligatorios</label>
					<input class="submit" type="submit" value="Enviar">
				</div>
			</form>

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