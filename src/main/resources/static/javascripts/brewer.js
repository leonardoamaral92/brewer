$(function() {
	var decimal = $('.js-decimal');
	decimal.maskMoney();

	var plain = $('.js-plain');
	plain.maskMoney({precision: 0});
	
	//Cadastro cliente masks
	$('#telefone').mask("(00) 0000-0000");
	
	//default - pessoa física -> cpf
	$('#cpf_cnpj').mask('000.000.000-00', {reverse: true});	
	
	$('#pFisica').change(function(){		
		updateMaskCpfCnpj();		
	});
	
	$('#pJuridica').change(function(){		
		updateMaskCpfCnpj();		
	});
	
})

function updateMaskCpfCnpj(){
	if($("#pFisica").is(':checked')){
		$('#cpf_cnpj').mask('000.000.000-00', {reverse: true});			  
	}
	else
		$('#cpf_cnpj').mask('00.000.000/0000-00', {reverse: true});
}