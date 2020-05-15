<html>
<body>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>


<script type="text/javascript">
$(document).ready(function(){
	$('#carga').click(function(event) {
		
	
		var btn =$('#carga').val();
		$.post('ServeletControler',{
			
			
		}, function(respose){
		
		let datos = JSON.parse(respose);
		//console.log(respose);
		var tabladatos = document.getElementById('tablaDatos');
		for(let item of datos){

			tabladatos.innerHTML += `
			<tr>

			<td>${item.id}</td>
			<td>${item.nombre}</td>	
			<td>${item.apellido}</td>			
			
			<td><a href="ServeletControler?btn=Eliminar&Id=${item.id}" class="btn btn-warning">ELIMINAR</a> 
			<a href="Actualizar.jsp?Id=${item.id}NombreU=${item.nombre}&ApellidoU=${item.apellido}" class="btn btn-danger">ACTUALIZAR</a> </td>
			
</tr>
`
		}


		});

	
	});
});

		
		
		
</script>








<a href="Login.jsp" class="btn btn-info" >Iniciar Sesion</a>
<a href="Actualizar.jsp" class="btn btn-info" >Ingresar Nuevo</a>

<button name="carga" id="carga">Cargar Datos</button>

	<table class="table table-dark" id="tablaDatos">
						<thead>  
								<th>ID</th>
								<th>NOMBRE</th>
								<th>APELLIDO</th>
								<th>OPCIONES</th>
								
						</thead>
							<tbody>
								
							</tbody>

					</table>


</body>
</html>
