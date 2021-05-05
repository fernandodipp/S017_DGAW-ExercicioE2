package com.aula.dados;

import java.util.ArrayList;
import com.aula.controller.*;
import com.aula.dados.*;
import com.aula.modelo.*;
import com.aula.negocio.*;
import com.aula.validacoes.*;

public class FuncionarioRepositorio {
	
	private ArrayList<FuncionarioModelo> listaFuncionarios = new ArrayList<FuncionarioModelo>();
	
	public void cadastrarFuncionario(FuncionarioModelo funcionario) {	
		listaFuncionarios.add(funcionario);
	}
	
	public void removerFuncionario(String nome) {		
		for(FuncionarioModelo funcionario : listaFuncionarios) {
			if(funcionario.nome.equals(nome)) {
				listaFuncionarios.remove(funcionario);
			}
		}
	}
	
	public FuncionarioModelo buscaFuncionario(String  nome) {
		for(FuncionarioModelo funcionario : listaFuncionarios) {
			if(funcionario.nome.equals(nome)) {
				return funcionario;
			}
		}
		return null;
	}
	
	public ArrayList<FuncionarioModelo> listarFuncionarios(){
		return listaFuncionarios;
	}
	
	
}
