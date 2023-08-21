package com.carros.theo.projeto.carros;

public record DadosCadastroCarros(
		String modelo,
		String marca,
		Carro tipo,
		String lote,
		int quantidade,
		Empresa empresa) {

}
