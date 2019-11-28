package com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.model.Livro;
import com.biblioteca.repository.*;

@Controller
public class LivroController {

	@Autowired
	private Livros livros;

	@GetMapping("/livros")
	public ModelAndView listar() {

		ModelAndView modelAndView = new ModelAndView("Listalivros");

		modelAndView.addObject("livros", livros.findAll());
		
		modelAndView.addObject("convidado", new Livro());

		return modelAndView;

	}

	@PostMapping("/livros")
	public String salvar(Livro convidado) {

		this.livros.save(convidado);

		return "redirect:/index";

	}

	public String getLivro(Livro livro) {
		this.livros.findById(livro.getId());

		return "redirect:/detalhes";
	}
//
//	public static boolean removeLivro() {
//
//		return true;
//	}
//
//	public static void updateLivro() {
//
//	}

}
