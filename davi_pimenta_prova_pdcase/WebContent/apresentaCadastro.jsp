<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="pacienteB" scope="session" class="br.com.prova.bean.PacienteBean"/>
Nome: <jsp:getProperty property="nome" name="pacienteB"/><br>
Numero da carteira do plano: <jsp:getProperty property="ncp" name="pacienteB"/><br>
Especialidade: <jsp:getProperty property="esp" name="pacienteB"/><br>
Plano de saude: <jsp:getProperty property="pds" name="pacienteB"/>
</body>
</html>