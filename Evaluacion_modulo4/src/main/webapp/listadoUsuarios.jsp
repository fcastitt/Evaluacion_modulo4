<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<%@page import="modelo.Usuario"%>

<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Usuarios</title>
	
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

 	<br>
 	
 	<%
	List<Usuario> usuarios = (List<Usuario>) request.getAttribute("listaDeUsuariosJsp");
	%>
	
	
	<section>

		<h1 class="tituloPrincipal">Listado de Usuarios</h1>

		<div class="contenido">

            <table class="contenido-centrar listado">
                <thead>
                    <tr>
                        <th>RUN</th>
                        <th>Nombre</th>
                        <th>apelidos</th>
                        <th>Fecha de Nacimiento</th>
                         
                        <th>Eliminar</th>
                        <th>Editar</th>
                    </tr>
                </thead>

                <tbody>
                
                <%
					for (Usuario dato : usuarios) {
				%>
                
                    <tr>
                    
                    	<td><%=dato.getRunUsuario()%></td>
                        <td><%=dato.getUsNombre()%></td>
                        <td><%=dato.getUsApellido()%></td>   
                        <td><%=dato.getUsNacimiento()%></td>
 				 
                        <td><a href="EliminarUsuario?RutUsuario=<%=dato.getRunUsuario()%>"><img src="https://cdn.icon-icons.com/icons2/55/PNG/128/editDelete_11203.png"
                                    width="30px"></a></td>
                        <td><a href="MostrarUsuario?RutUsuario=<%=dato.getRunUsuario()%>"><img
                                    src="https://cdn.icon-icons.com/icons2/402/PNG/128/edit-validated_40458.png"
                                    width="30px"></a></td>
                    </tr>
 				
 				<%
					}
	            //fin
				%>
  
                        

                </tbody>

                <tfoot>
                    <tr>
                        <td colspan="5"></td>
                        <td>
                            <br>
                            <input type="button" onclick="location.href='CrearUsuario';" value="Crear usuario">
                        </td>
                    </tr>
                </tfoot>

            </table>
            
            <br>
            <br>
          

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