<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="pacienteB" scope="session" class="br.com.prova.bean.PacienteBean"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form name="alteracaoCadastroPaciente" action="/davi_pimenta_prova_pdcase/Controller?classe=ControllerLogicPacienteEditar" method="post">
	<table border="0">
		<thead>
			<tr>
				<th colspan="2">
					Alteração no cadastro de Paciente
				</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Nome Paciente:</td>
				<td><input type="text" name="nome" size="20" value="usr.nome"/></td>
			</tr>
			<tr>
				<td>Numero da Carteira do plano:</td>
				<td><input type="text" name="ncp" size="20" value="usr.ncp"/></td>
			</tr>
			<tr>
				<td>Especialidade:</td>
				<td><input type="text" name="esp" size="20" value="usr.esp"/></td>
			</tr>
			<tr>
				<td>Plano de Saude:</td>
				<td><input type="text" name="pds" size="20" value="usr.pds"/></td>
			</tr>
			<tr>
				<td><input type="submit" name="enviar" value="Salvar"/></td>
				<td><input type="reset" name="limpar" value="Limpar"/></td>
			</tr>
		</tbody>
	</table>
</form>
</center>
</body>
</html>