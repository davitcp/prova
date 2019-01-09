package br.com.prova.util;

import br.com.prova.dao.JDBCPacienteDAO;
import br.com.prova.dao.PacienteDAO;

public class DAOFactory {
	public static PacienteDAO createPacienteDAO(){
		return new JDBCPacienteDAO();
	}
}
