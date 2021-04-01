/**
 * 
 */
 
$(document).ready(function () {

  	$("#formCapacitacion").validate({
		rules: {
			fecha: {
				required: true,
				delimiter: '/',
    			datePattern: ['Y', 'm', 'd']
			},

			lugar: {
				required: true,
				maxlength: 100
			},

			duracion: {
				max: 4
			},

			rutCliente: {
				required: true,
				max: 999999999,
			}

		},
		
		messages: {
			
			fecha: {
				required: "Obligatorio",
				delimiter: "Se requiere el siguiente formato: [DD/MM/YYYY]",
    			datePattern: "Se requiere el siguiente formato: [DD/MM/YYYY]"
			},

			lugar: {
				required: "Obligatorio",
				 
			},

			duracion: {
				max: "Se requieren menos de {0} caracteres!"
			},

			rutCliente: {
				required: "Obligatorio",
				max: "Se requieren menos de {0} caracteres!",
			}


		}
	});
	
});
	
 