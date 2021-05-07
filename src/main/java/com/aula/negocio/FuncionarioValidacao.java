/*Validação, não aceitar nome em branco
salario menor que 0 ou maior 1000.
O Setor não pode ser em branco.*/

package com.aula.negocio;

//import com.aula.controller.*;
//import com.aula.dados.*;
import com.aula.modelo.*;
//import com.aula.negocio.*;
//import com.aula.validacoes.*;

public class FuncionarioValidacao {
	public boolean valida(FuncionarioModelo funcionario) {
		FuncionarioModelo funcObjeto = new FuncionarioModelo();
		String nomeFuncionario = funcObjeto.getNome();
		String setorFuncionario = funcObjeto.getSetor();
		String salarioFuncionario = funcObjeto.salario;
		float salarioParse  = Float.parseFloat(salarioFuncionario);
		
		if(nomeFuncionario == null || nomeFuncionario.equals("")) {
			return false;
		}
		if(salarioParse > 1000 || salarioParse < 0) {
			return false;			
		} 
		if(setorFuncionario == null || setorFuncionario.equals("")) {
			return false;
		}
			return true;
		}		
	
}