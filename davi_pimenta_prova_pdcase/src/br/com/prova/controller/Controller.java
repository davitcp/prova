package br.com.prova.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.prova.controller.logic.ControllerLogic;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//Controlador que receberá todas as requisições
		try {	
			Class classe= Class.forName("br.com.prova.controller.logic."+request.getParameter("classe"));
			ControllerLogic controller = (ControllerLogic) classe.newInstance();
			controller.executar(request, response);
		} catch (Exception e) {
			log(e.getMessage());
		} 
	}
    
	
	
	
	
	
	
	
	
	
	public Controller() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
