<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
<center>
<form name="cadastroPaciente" action="/davi_pimenta_prova_pdcase/Controller?classe=ControllerLogicPacienteCadastrar" method="post">
	<table border="0">
		<thead>
			<tr>
				<th colspan="2">
					Cadastro de Paciente
				</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Nome Paciente:</td>
				<td><input type="text" name="nome" size="20"/></td>
			</tr>
			<tr>
				<td>Numero da Carteira do plano:</td>
				<td><input type="text" name="ncp" size="20"/></td>
			</tr>
			<tr>
				<td>Especialidade:</td>
				<td><input type="text" name="esp" size="20"/></td>
			</tr>
			<tr>
				<td>Plano de Saude:</td>
				<td><input type="text" name="pds" size="20"/></td>
			</tr>
			<tr>
				<td><input type="submit" name="cadastrar" value="Cadastrar"/></td>
				<td><input type="reset" name="limpar" value="Limpar"/></td>
			</tr>
		</tbody>
	</table>
</form>
</center>
</body>
</html>