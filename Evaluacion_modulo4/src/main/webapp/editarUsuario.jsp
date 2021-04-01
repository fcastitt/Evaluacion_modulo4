<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<%@page import="modelo.Cliente"%>
<%@page import="modelo.Profesional"%>
<%@page import="modelo.Administrativo"%>

<%@page import="java.util.List"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Usuario</title>

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
 	
 
 
  	<%
 
 	
	Cliente dato1 =  (Cliente) request.getAttribute("mostrarClienteJsp");
 	Profesional dato2 =  (Profesional) request.getAttribute("mostrarProfesionalJsp");
 	Administrativo dato3 =  (Administrativo) request.getAttribute("mostrarAdministrativoJsp");
 	
 	Integer datoRunUsuario = 0 ; 
 	String datoUsNombre = "" ;  
 	String datoUsApellido = ""  ; 
 	String datoUsNaciemiento = "" ;
 		
 	String datoSelectCliente = "";
 	String datoSelectProfesional = "";
 	String datoSelectAdministrativo= "";
 	  
 	String datoSelectSistemasalud1 = "" ; 
 	String datoSelectSistemasalud2 = "" ; 
 	  
 	  
 	  
 
 	if(dato1.getRunUsuario()!=null){	
 		datoRunUsuario = dato1.getRunUsuario();
 		datoUsNombre = dato1.getUsNombre();
 		datoUsApellido = dato1.getUsApellido();
 		datoUsNaciemiento = dato1.getUsNacimiento();
 		datoSelectCliente = "Selected";
 		datoSelectProfesional = "Disabled";
 		datoSelectAdministrativo = "Disabled";
 		
 		if(dato1.getCliSistemasalud()==1){
 			datoSelectSistemasalud1 = "Selected";
 		}else if(dato1.getCliSistemasalud()==2){
 			datoSelectSistemasalud2 = "Selected";
 		}
 		
 	}
 	
 	if(dato2.getRunUsuario()!=null){	
 		datoRunUsuario = dato2.getRunUsuario();
 		datoUsNombre = dato2.getUsNombre();
 		datoUsApellido = dato2.getUsApellido();
 		datoUsNaciemiento = dato2.getUsNacimiento();
 		datoSelectCliente = "Disabled";
 		datoSelectProfesional = "Selected";
 		datoSelectAdministrativo = "Disabled";
 	}
 	
 	if(dato3.getRunUsuario()!=null){	
 		datoRunUsuario = dato3.getRunUsuario();
 		datoUsNombre = dato3.getUsNombre();
 		datoUsApellido = dato3.getUsApellido();
 		datoUsNaciemiento = dato3.getUsNacimiento();
 		datoSelectCliente = "Disabled";
 		datoSelectProfesional = "Disabled";
 		datoSelectAdministrativo = "Selected";
 	}
 	
 
	%>
	
	
	<section>

		<h1 class="tituloPrincipal">Modificar Usuario</h1>

		<div class="contenido formularios">
		
	
			<form action="FromActualizarUsuario" method="post" id="formActualizarUsuario">

				<div class="label-input">
					<label for="runusuario" class="form-label">RUN:</label> <input
						type="number" id="runusuario" name="runusuario" value="<%=datoRunUsuario%>" readonly style="background-color:lightgrey;">
				</div>

				<div class="label-input">
					<label for="usnombre" class="form-label">Nombre :</label>
					<input type="text" id="usnombre" name="usnombre" value="<%=datoUsNombre%>">
				</div>

				<div class="label-input">
					<label for="usapellido" class="form-label">Apellido :</label>
					<input type="text" id="usapellido" name="usapellido" value="<%=datoUsApellido%>">
				</div>

				<div class="label-input">
					<label for="usnacimiento" class="form-label">Fecha de Nacimiento :</label> <input
						type="text" id="usnacimiento" name="usnacimiento" value="<%=datoUsNaciemiento%>">
				</div>
				
				<div class="label-input">
					<label for="fechaNacimiento" class="form-label">Tipo de usuario</label>
 
					<select id="perfil" name="perfil">
						<option value="0" ></option>
						<option value="1" <%=datoSelectCliente%> >Cliente</option>
						<option value="2" <%=datoSelectProfesional%> >Profesional</option>
						<option value="3" <%=datoSelectAdministrativo%> >Administrativo</option>
					</select>
					
					
				</div>
				
				<div id="cliente" class="label-input">
					<h3>Datos de Cliente</h3>
		
					<label for="rutcliente" class="form-label">Rut Cliente:</label>
					<input type="number" id="rutcliente" name="rutcliente" value="<%=dato1.getRutCliente()%>" readonly>
					
					<label for="clitelefono" class="form-label">Telefono:</label>
					<input type="text" id="clitelefono" name="clitelefono" value="<%=dato1.getCliTelefono()%>">
					
					<label for="cliafp" class="form-label">Afp:</label>
					<input type="text" id="cliafp" name="cliafp" value="<%=dato1.getCliAfp()%>">
					
					<label for="clisistemasalud" class="form-label">Sistema de salud:</label>
					<select id="clisistemasalud" name="clisistemasalud" value="<%=dato1.getCliSistemasalud()%>">
						<option value="0"></option>
						<option value="1" <%=datoSelectSistemasalud1%> >Fonasa</option>
						<option value="2" <%=datoSelectSistemasalud2%> >Isapre</option>		 
					</select>
					 
					<label for="clidireccion" class="form-label">Direccion:</label>
					<input type="text" id="clidireccion" name="clidireccion" value="<%=dato1.getCliDireccion()%>">
					
					<label for="clicomuna" class="form-label">Comuna:</label>
					<input type="text" id="clicomuna" name="clicomuna" value="<%=dato1.getCliComuna()%>">
					
					<label for="cliedad" class="form-label">Edad:</label>
					<input type="number" id="cliedad" name="cliedad" value="<%=dato1.getCliEdad()%>">
 	 	 
 				</div>
 				
 				<div id="profesional" class="label-input">
					<h3>Datos de Profesional</h3>
					
					<label for="protelefono" class="form-label">Telefono :</label>
					<input type="text" id="protelefono" name="protelefono" value="<%=dato2.getProTelefono()%>">
					
					<label for="protitulo" class="form-label">Titulo :</label>
					<input type="text" id="protitulo" name="protitulo" value="<%=dato2.getProTitulo()%>">
					
					<label for="proproyecto" class="form-label">Proyecto :</label>
					<input type="text" id="proproyecto" name="proproyecto" value="<%=dato2.getProProyecto()%>">
					
 				</div>
 				
 				<div id="administrativo" class="label-input">
					<h3>Datos de Administrativo</h3>
					
					<label for="adcorreo" class="form-label">Correo :</label>
					<input type="text" id="adcorreo" name="adcorreo" value="<%=dato3.getAdCorreo()%>">
					
					<label for="adarea" class="form-label">Area :</label>
					<input type="text" id="adarea" name="adarea" value="<%=dato3.getAdArea()%>">
 				 
 				</div>
 				
				<div class="label-input">
					<label for="nose" class="form-label">(*) Datos obligatorios</label>
					<input class="submit" type="submit" value="Modificar">
					<br>
					<input type="button" onclick="location.href='ListadoUsuarios';" value="Volver">
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