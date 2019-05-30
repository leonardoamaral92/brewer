package com.algaworks.brewer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CervejasController {
	
	@GetMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		return "cerveja/CadastroCerveja"; // FOWARD: retorno o NOME da view
	}
	
	/*Ao definir um objeto, caso ele possua os getters e setters e os atributos "name" no html esteja correto, 
	 * o Spring criará o objeto e preencherá com os valores inseridos na view
	 * para isso também é importante MANTER o construtor default na classe Cerveja
	*/
	@PostMapping("/cervejas/novo")
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			return novo(cerveja);
		}
		
		attributes.addFlashAttribute("mensagem", "Cerveja cadastrada com sucesso!");		
		return "redirect:/cervejas/novo";  //REDIRECT: redireciono para uma URL específica
	}
	
}
