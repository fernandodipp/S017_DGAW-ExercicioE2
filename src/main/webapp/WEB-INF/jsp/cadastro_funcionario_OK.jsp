<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList,com.aula.controller.*,com.aula.dados.*,com.aula.modelo.*,com.aula.negocio.*,com.aula.validacoes.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cadastro_funcionario_OK</title>
</head>
<body>

SUCESSO NO CADASTRO DO FUNCIONÁRIO, PARABENS.<br><br>
	<%
	FuncionarioRepositorio servico = new FuncionarioRepositorio();
		ArrayList<FuncionarioModelo> listaFuncionarios = servico.listarFuncionarios();
	
		for(FuncionarioModelo funcionario : listaFuncionarios){
			out.println("<tr>");
				out.println("<td>");
				out.println(funcionario.getNome());
				out.println("</td>");
				out.println("<td>");
				out.println(funcionario.getSetor());
				out.println("</td>");
				out.println("<td>");
				out.println(funcionario.getSalario());
				out.println("</td>");
			out.println("</tr>");
		}
	%>

</body>
</html>