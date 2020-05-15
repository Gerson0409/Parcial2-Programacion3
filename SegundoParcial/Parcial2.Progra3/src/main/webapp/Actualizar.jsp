<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</head>
<%
String idBus = request.getParameter("idcarga");
String nombreU = request.getParameter("NombreU");
String apellidoU = request.getParameter("ApellidoU");


if(idBus==null){
	
	idBus="";
	nombreU="";
	apellidoU="";
	
}

%>
<body>


<form action="ServeletControler">
<table align="center">
	<thead>
		
	</thead>
  <tbody>
   <tr>
	<td>
		
	<p>Id</p><input type="text" name="ID" id="idcarga" value="<%=idBus%>">	 
	<p>Nombre</p><input type="text" name="nomBre" id="NombreU" value="<%=nombreU%>">
	<p>Apellido</p><input type="text" name="aPellido" id="ApellidoU" value="<%=apellidoU%>">		
		
	<br>
	<br>

	</td>	
   </tr>	
  </tbody>
  
</table>

<input type="submit" class="btn btn-info" value="Guardar" name="btn">
<input type="submit" class="btn btn-info" value="Actualizar" name="btn">

</body>
</html>