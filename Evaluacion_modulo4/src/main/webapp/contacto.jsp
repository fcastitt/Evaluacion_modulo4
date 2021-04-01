<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacto</title>

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
		<%@ include file="js/contacto.js" %>
	</script>

	<style type="text/css">
		<%@ include file="css/estilo.css" %>
	</style>

</head>

<body>

	<%@ include file='menu/menu.jsp' %>
	
 	<br>
	<section>

		<h1 class="tituloPrincipal">Contacto</h1>

		<div class="contenido formularios">

			<form action="ProcesaContacto" method="post" id="formContacto">

				<div class="label-input">
					<label for="nombre" class="form-label">Nombre* :</label> <input
						type="text" id="nombre" name="nombre">
				</div>

				<div class="label-input">
					<label for="mail" class="form-label">Correo Electronico* :</label>
					<input type="text" id="mail" name="mail">
				</div>

				<div class="label-input">
					<label for="telefono" class="form-label">Telefono*
						[+569XXXXXXXX] :</label> <input type="text" id="
						telefono"
						name="telefono">
				</div>

				<div class="label-input">
					<label for="mensaje" class="form-label">Mensaje* :</label> <input
						type="text" id="mensaje" name="mensaje">
				</div>


				<div class="label-input">
					<label for="genero" class="form-label">Genero* :</label> <select
						id="genero" name="genero">
						<option value=""></option>
						<option value="1">Hombre</option>
						<option value="2">Mujer</option>
					</select>
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