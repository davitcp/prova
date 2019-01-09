package br.com.prova.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.prova.bean.PacienteBean;
import br.com.prova.util.ConnectionFactory;

public class JDBCPacienteDAO implements PacienteDAO{

	Connection connection;
	public JDBCPacienteDAO() {
		connection = ConnectionFactory.getConnection();
	}
	
	@Override
	public void inserir(PacienteBean paciente) {
		try{
		String SQL = "insert into fichapaciente (NomePaciente,NumeroCarteiraPlano,PlanoDeSaude,Especialidade) values (?,?,?,?);";
		PreparedStatement ps = connection.prepareStatement(SQL);
		ps.setString(1, paciente.getNome());
		ps.setString(2, paciente.getNcp());
		ps.setString(3, paciente.getPds());
		ps.setString(4, paciente.getEsp());
		
		ps.executeUpdate();
		ps.close();
		//connection.close();
		}catch(Exception e){
			throw new RuntimeException("Falha na inserção: "+e);
		}
	}

	@Override
	public void remover(int id) {
		try{
			String SQL = "delete from especialidades where id=?";
			PreparedStatement ps = connection.prepareStatement(SQL);
			ps.setInt(1,id);
			ps.executeUpdate();
			ps.close();
	}catch(Exception e){
		throw new RuntimeException("Falha na exclusao: "+e);
	}
	}

	@Override
	public List<PacienteBean> listar() {
		List<PacienteBean> pacientes = new ArrayList<PacienteBean>();
		try {
		String SQL = "select * from fichapaciente;";
		PreparedStatement ps = connection.prepareStatement(SQL);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			PacienteBean paciente = new PacienteBean();
			paciente.setNome(rs.getString("NomePaciente"));
			paciente.setNcp(rs.getString("NumeroCarteiraPlano"));
			paciente.setPds(rs.getString("PlanoDeSaude"));
			paciente.setEsp(rs.getString("Especialidade"));
			pacientes.add(paciente);
		}
		ps.close();
		rs.close();
		return pacientes;
		} catch (SQLException e) {
			throw new RuntimeException("Falha na listagem: "+e);
		}
	}

	@Override
	public PacienteBean buscar(int id) {
		try{
			PacienteBean paciente = new PacienteBean();
			String SQL = "select * from fichapaciente where id =?";
			PreparedStatement ps= connection.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			paciente.setNome(rs.getString("nome"));
			paciente.setNcp(rs.getString("ncp"));
			paciente.setPds(rs.getString("pds"));
			paciente.setEsp(rs.getString("esp"));
			
			ps.close();
			rs.close();
			return paciente;
		}catch(Exception e){
			throw new RuntimeException("Falha na busca: "+e);
		}
	}

	@Override
	public void editar(PacienteBean paciente) {
		try{
			String SQL = "update fichapaciente set NomePaciente=?,NumeroCarteiraPlano=?,PlanoDeSaude=?,Especialidade=? where id=?";
			PreparedStatement ps = connection.prepareStatement(SQL);
			ps.setString(1, paciente.getNome());
			ps.setString(2, paciente.getNcp());
			ps.setString(3, paciente.getPds());
			ps.setString(4, paciente.getEsp());
			ps.setInt(5,paciente.getId());
			
			ps.executeUpdate();
			ps.close();
		}catch(Exception e){
			throw new RuntimeException("Falha na edição: "+e);
		}
	}

}
