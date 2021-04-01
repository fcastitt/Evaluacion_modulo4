<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

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
		<%@ include file="js/login.js" %>
	</script>
	
	<style type="text/css">
		<%@ include file="css/estilo.css" %>
	</style>

</head>

<body>
	<br>
	<section>

		<h1 class="tituloPrincipal">Login</h1>

		<div class="contenido formularios">

			<form action="FormLogin" method="post" id="formLogin">

				<div class="label-input">
					<label for="usuario" class="form-label">Usuario*: </label> <input
						type="text" id="usuario" name="usuario">
				</div>

				<div class="label-input">
					<label for="clave" class="form-label">Clave* :</label>
					<input type="text" id="clave" name="clave">
				</div>
				
				<div class="label-input">
					<label for="nose" class="form-label">(*) Datos obligatorios</label>
					<input class="submit" type="submit" value="Entrar">
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