/**
 * 
 */
 
 
$(document).ready(function () {

 	$("#formLogin").validate({
		rules: {
			usuario: {
				required: true,
			},

			clave: {
				required: true,
			},
 
		},
		
		messages: {
			
			usuario: {
				required: "Obligatorio",
			},

			clave: {
				required: "Obligatorio",
			},

		}
	});
	
	
});
	