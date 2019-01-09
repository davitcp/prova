package br.com.prova.dao;

import java.util.*;

import br.com.prova.bean.PacienteBean;

public interface PacienteDAO {
	public void inserir(PacienteBean paciente);
	public void remover (int id);
	public List<PacienteBean> listar();
	public PacienteBean buscar(int id);
	public void editar(PacienteBean paciente);
}
