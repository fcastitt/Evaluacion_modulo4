/**
 * 
 */

$(document).ready(function () {
	
	$("#formUsuario").validate({
		rules: {
 
			runusuario: {
				required: true,
				max: 999999999,
				},

			usnombre: {
				required: true,
				maxlength: 30
				},

			usapellido: {
				required: true,
				maxlength: 50
				},

			usnacimiento: {
				required: true,
				delimiter: '/',
    			datePattern: ['Y', 'm', 'd']
				},
				
			perfil: {
				required: true,
				min: 1 , 
				max: 3
				}
		},
		
		messages: {
			
			runusuario: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},

			usnombre: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			usapellido: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			usnacimiento: {
				required: "Obligatorio"
				},
				
			perfil: {
				required: "Obligatorio",
				min: "Selecione un perfil",
				max: "Selecione un perfil"
				}
		}
	});


	
	$("#cliente").hide();
	$("#profesional").hide();
	$("#administrativo").hide();
	
	$("#perfil").change(function(){
		
		if($("#perfil").val()==1){
			$("#cliente").show();
			$("#profesional").hide();
			$("#administrativo").hide();
				
		}else if($("#perfil").val()==2){
			$("#cliente").hide();
			$("#profesional").show();
			$("#administrativo").hide();
			
			$("#formUsuario").validate({
				rules: {
		 
					protelefono: {
						required: true,
						minlength: 12
						},
		
					protitulo: {
						required: true,
						maxlength: 30
						},
						
					proproyecto: {
						required: true,
						maxlength: 30
						},
				},
				
				messages: {
					
					adcorreo: {
						required: "Obligatorio",
						email: "Ingrese un email valido",
						},
		
					adarea: {
						required: "Obligatorio",
						maxlength: "Se requieren menos de {0} caracteres!"
						},
						
					proproyecto: {
						required: "Obligatorio",
						maxlength: "Se requieren menos de {0} caracteres!"
						},
					}
					
				});
			
			
		}else if($("#perfil").val()==3){
			
			$("#cliente").hide();
			$("#profesional").hide();
			$("#administrativo").show();
			
			$("#formUsuario").validate({
				rules: {
		 
					adcorreo: {
						required: true,
						email: true
						},
		
					adarea: {
						required: true,
						maxlength: 30
						},
				},
				
				messages: {
					
					adcorreo: {
						required: "Obligatorio",
						email: "Ingrese un email valido",
						},
		
					adarea: {
						required: "Obligatorio",
						maxlength: "Se requieren menos de {0} caracteres!"
						},
					}
				});
					
			
		
		}else if($("#perfil").val()==0) {
			$("#cliente").hide();
			$("#profesional").hide();
			$("#administrativo").hide();
		} 
		
	});
	
	
	if($("#perfil").val()==1){
	
		$("#cliente").show();
		$("#profesional").hide();
		$("#administrativo").hide();
		
	}else if($("#perfil").val()==2){
	
		$("#cliente").hide();
		$("#profesional").show();
		$("#administrativo").hide();
		
	}else  if($("#perfil").val()==3){
	
		$("#cliente").hide();
		$("#profesional").hide();
		$("#administrativo").show();
		
		 
		
	}else{
		
		
		
	}
});
 