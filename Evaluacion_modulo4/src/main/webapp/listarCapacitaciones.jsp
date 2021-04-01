<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<%@page import="modelo.Capacitacion"%>

<%@page import="java.util.List"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Capacitaciones</title>
	
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
	//Clase_7_Grupal_6 punto 6
	List<Capacitacion> capacitaciones = (List<Capacitacion>) request.getAttribute("listaDeCapacitacionesJsp");
	
	%>

 	
	<section>

		<h1 class="tituloPrincipal">Listado de Capacitaciones</h1>

		<div class="contenido">

            <table class="contenido-centrar">
                <thead>
                    <tr>
                        <th>Id_capacitacion</th>
                        <th>Fecha</th>
                        <th>Hora</th>
                        <th>Lugar</th>
                        <th>Duracion</th>
                        <th>Rut Cliente</th>
                            
                    </tr>
                </thead>
                
                <tbody>
                   
	            <%
					for (Capacitacion dato : capacitaciones) {
				%>

					<tr>
					
					<td><%=dato.getIdCapacitacion()%></td>
						<td><%=dato.getCapFecha()%></td>
						<td><%=dato.getCapHora()%></td>
						<td><%=dato.getCapLugar()%></td>
						<td><%=dato.getCapDuracion()%></td>
						<td><%=dato.getClienteRutCliente()%></td> 
					</tr>
	
				<%
					}
	            //fin
				%>
   
                </tbody>

                <tfoot>
                    <tr>
                        <td colspan="5"></td>
                        <td><br>
                        
                            <input type="button" onclick="location.href='CrearCapacitacion';"
                                value="Crear capacitacion">
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