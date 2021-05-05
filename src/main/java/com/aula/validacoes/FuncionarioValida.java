/*Validação, não aceitar nome em branco
 * salario menor que 0 ou maior 1000.
 * O Setor não pode ser em branco.
*/
package com.aula.validacoes;

public class FuncionarioValida {
	public boolean validaNome(String nomeFuncionario) {
		if(nomeFuncionario == null || nomeFuncionario.equals("")) {
			return false;
		}else {
			return true;
		}		
	}
	public boolean validaSalario(int salarioFuncionario) {
		if(salarioFuncionario > 1000 || salarioFuncionario < 0) {
			return false;			
		} else {
			return true;
		}
	}
	public boolean validaSetor(String setorFuncionario) {
		if(setorFuncionario == null || setorFuncionario.equals("")) {
			return false;
		}else {
			return true;
		}		
	}
}
