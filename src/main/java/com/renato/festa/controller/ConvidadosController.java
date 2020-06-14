package com.renato.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.renato.festa.model.Convidado;
import com.renato.festa.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;

	@GetMapping
	public ModelAndView salvar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidados.findAll());
		//command object -> objeto do formulário
		modelAndView.addObject(new Convidado());
		return modelAndView;
	}
	@PostMapping
	public String salvar(Convidado convidado) {
		System.out.println(convidado);
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
	
	
}
