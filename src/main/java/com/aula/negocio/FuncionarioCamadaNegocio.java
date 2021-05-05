package com.aula.negocio;

import com.aula.controller.*;
import com.aula.dados.*;
import com.aula.modelo.*;
import com.aula.negocio.*;
import com.aula.validacoes.*;

public class FuncionarioCamadaNegocio {

	FuncionarioValidacao validador = new FuncionarioValidacao();
	FuncionarioRepositorio pessoaRepositorio = new FuncionarioRepositorio();
	
	/**
	 * Salva uma pessoa
	 * @param pessoa
	 * @return Retorna verdadeiro, caso a pessoa tenha sido salva, senao falso, para error.
	 */
	public boolean salvarFuncionario(FuncionarioModelo funcionario) {
		System.out.println("EXECUTEI A FUNCAO SALVAR_PESSOA");
		
		boolean resultadoValidacao = validador.valida(funcionario);
		if(resultadoValidacao == true) {
			System.out.println("pessoa validada com sucesso");
			pessoaRepositorio.cadastrarFuncionario(funcionario);
			return true;
		}else {
			System.out.println("erro na validacao da pessoa");
			return false;
		}
		
	}
	
}
