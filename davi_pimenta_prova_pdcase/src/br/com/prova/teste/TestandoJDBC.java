package br.com.prova.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.prova.bean.PacienteBean;
import br.com.prova.dao.PacienteDAO;
import br.com.prova.util.DAOFactory;

public class TestandoJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		PacienteDAO pd = DAOFactory.createPacienteDAO();
		List<PacienteBean> pacientes = pd.listar();
		for(PacienteBean paciente:pacientes){
			System.out.println("============================");
			System.out.println("Nome: "+paciente.getEsp());
			System.out.println("============================");
		}
		
		
		
		
		/*PacienteBean paciente = new PacienteBean();
		paciente.setEsp("canela");
		
		PacienteDAO pd = DAOFactory.createPacienteDAO();
		pd.inserir(paciente);*/
		
		
		
		
		/*Connection con = new ConnectionFactory().getConnection();
        String sql = "insert into especialidades (Id, Nome) values (?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, "9");
        stmt.setString(2, "ombro");
        stmt.execute();
        stmt.close();
        
        String sql2 = "insert into planodesaude (Id, Nome) values (?,?)";
        PreparedStatement stmt2 = con.prepareStatement(sql2);
        stmt2.setString(1, "9");
        stmt2.setString(2, "bancorbras");
        stmt2.execute();
        stmt2.close();
        
        String sql3 = "insert into fichapaciente (NomePaciente, NumeroCarteiraPlano, IdPlanoDeSaude, IdEspecialidade) values (?,?,?,?)";
        PreparedStatement stmt3 = con.prepareStatement(sql3);
        stmt3.setString(1, "Gabriel");
        stmt3.setString(2, "5");
        stmt3.setString(3, "9");
        stmt3.setString(4,"9" );
        stmt3.execute();
        stmt3.close();
        
        System.out.println("Gravado!");
        con.close();*/
    }
}
