<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Capacitacion</title>

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
		<%@ include file="js/crearCapacitacion.js" %>
	</script>
	
	<style type="text/css">
		<%@ include file="css/estilo.css" %>
	</style>

</head>

<body>

	<%@ include file='menu/menu.jsp' %>
	
 	<br>
	<section>

		<h1 class="tituloPrincipal">Crear capacitacion</h1>

		<div class="contenido formularios">

			<form action="FormCrearCapacitacion" method="post" id="formCapacitacion">
			
				<!-- IDCAPACITACION INTERNO -->

				<div class="label-input">
					<label for="fecha" class="form-label">Fecha* [dd/mm/yyyy]:</label> <input
						type="text" id="fecha" name="fecha">
				</div>

				<div class="label-input">
					<label for="hora" class="form-label">Hora :</label>
					<input type="time" id="hora" name="hora">
				</div>

				<div class="label-input">
					<label for="lugar" class="form-label">Lugar* :</label> <input type="text" id="
						lugar"
						name="lugar">
				</div>

				<div class="label-input">
					<label for="duracion" class="form-label">Duración :</label> <input
						type="number" id="duracion" name="duracion">
				</div>
				
				<div class="label-input">
					<label for="rutCliente" class="form-label">Rut Cliente*:</label> <input
						type="number" id="rutCliente" name="rutCliente">
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