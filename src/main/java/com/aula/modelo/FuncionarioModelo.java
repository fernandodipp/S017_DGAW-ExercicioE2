package com.aula.modelo;

import com.aula.controller.*;
import com.aula.dados.*;
import com.aula.modelo.*;
import com.aula.negocio.*;
import com.aula.validacoes.*;

public class FuncionarioModelo {
	public String nome;
	public String setor;
	public String salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
	
}
