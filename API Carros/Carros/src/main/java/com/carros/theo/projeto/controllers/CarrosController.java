package com.carros.theo.projeto.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carros.theo.projeto.carros.DadosCadastroCarros;

@RestController
@RequestMapping("/carros")
public class CarrosController {

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroCarros dados) {
		System.out.println(dados);
	}
}
