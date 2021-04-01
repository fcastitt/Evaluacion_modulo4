/**
 * 
 */

$(document).ready(function () {
	
	$("#formContacto").validate({
		rules: {
			nombre: {
				required: true,
				maxlength: 50,
			},

			mail: {
				required: true,
				email: true
			},

			telefono: {
				required: true,
				minlength: 12
			},

			mensaje: {
				required: true,
				maxlength: 250
			},

			genero: {
				required: true,
			},

			 
		},
		
		messages: {
			
			
			nombre: {
				required: "Obligatorio",
				maxlength:"Se requieren menos de {0} caracteres!",
			},

			mail: {
				required: "Obligatorio",
				email: "Se requiere email valido"
			},

			telefono: {
				required: "Obligatorio",
				minlength: "Se requieren formato [+569XXXXXXXX]"
			},

			mensaje: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
			},

			genero: {
				required: "Obligatorio",
			},

		}
	});


});
