package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.aula.controller.*;
import com.aula.dados.*;
import com.aula.modelo.*;
import com.aula.negocio.*;
import com.aula.validacoes.*;

@Controller
public class FuncionarioController {
	
	@RequestMapping(value = "/prepara_cadastro_funcionario", method = RequestMethod.GET)
	public String preparaCadastrofuncionario() {		
		return "cadastro_funcionario";
	}
	
	// CONTROLADOR
	@RequestMapping(value = "/cadastro_funcionario", method = RequestMethod.POST)
	public String cadastrafuncionario(
			@RequestParam(name = "nome") String nome,
			@RequestParam(name = "salario") String salario,
			@RequestParam(name = "setor") String setor,
			Model model) {		
		
		// MODELO
		FuncionarioValida validafuncionario = new FuncionarioValida();
		int salarioParse = Integer.parseInt(salario);
		boolean resultadoNome = validafuncionario.validaNome(nome);
		boolean resultadoSalario = validafuncionario.validaSalario(salarioParse);
		boolean resultadoSetor = validafuncionario.validaSetor(nome);
		
		// DEFINICAO DE QUAL VIEW VAI SER EXECUTADO, BASEADO NO RETORNO DO MODELO
		if(resultadoNome == false) {
			return "cadastro_funcionario_ERROR";
		}else {		
			if(resultadoSalario == false) {
				return "cadastro_funcionario_ERROR";
			}else {
				if(resultadoSetor == false) {

					return "cadastro_funcionario_ERROR";
				}else {		
					return "cadastro_funcionario_OK";}}}

	}
	
	
		@RequestMapping(value = "/prepara_cadastro_funcionario2", method = RequestMethod.GET)
		public String preparaCadastrofuncionario2() {		
			return "cadastroFuncionarioCamadaApresentacao";
		}
	
		@RequestMapping(value = "/cadastro_funcionario_2", method = RequestMethod.POST)
		public String cadastrafuncionario2(
				@RequestParam(name = "nome") String nome,
				@RequestParam(name = "salario") String salario,
				@RequestParam(name = "setor") String setor,
				Model model) {		
			

			FuncionarioCamadaNegocio camadaNegocio = new FuncionarioCamadaNegocio();
			
			FuncionarioModelo modelo = new FuncionarioModelo();
			modelo.nome = nome;
			modelo.setor = setor;
			modelo.salario = salario;
			
			boolean resultado = camadaNegocio.salvarFuncionario(modelo);
			
			if(resultado == true) {
				return "cadastro_funcionario_OK";
			}else {		
				return "cadastro_funcionario_ERROR";
			}
		}
}
