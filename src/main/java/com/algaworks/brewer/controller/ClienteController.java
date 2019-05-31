package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cliente;

@Controller
public class ClienteController {

	@GetMapping("/clientes/novo")
	public String novo(Cliente cliente) {
		return "cliente/CadastroCliente"; // FOWARD: retorno o NOME da view
	}
	
	/*Ao definir um objeto, caso ele possua os getters e setters e os atributos "name" no html esteja correto, 
	 * o Spring criará o objeto e preencherá com os valores inseridos na view
	 * para isso também é importante MANTER o construtor default na classe Cerveja
	*/
	@PostMapping("/clientes/novo")
	public String cadastrar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			return novo(cliente);
		}
		
		attributes.addFlashAttribute("mensagem", "Cliente cadastrado com sucesso!");		
		return "redirect:/clientes/novo";  //REDIRECT: redireciono para uma URL específica
	}
	
}
