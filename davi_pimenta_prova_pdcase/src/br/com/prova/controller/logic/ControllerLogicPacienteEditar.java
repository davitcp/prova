package br.com.prova.controller.logic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.prova.bean.PacienteBean;

public class ControllerLogicPacienteEditar implements ControllerLogic {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PacienteBean usr = new PacienteBean();
		
		usr.setNome(request.getParameter("nome"));
		usr.setNcp(request.getParameter("ncp"));
		usr.setEsp(request.getParameter("esp"));
		usr.setPds(request.getParameter("pds"));
		
		request.setAttribute("pacienteB", usr);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
