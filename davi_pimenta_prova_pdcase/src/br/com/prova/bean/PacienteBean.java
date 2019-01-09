package br.com.prova.bean;

import java.io.Serializable;

public class PacienteBean implements Serializable{
	private int id;
	private String nome;
	private String ncp;
	private String esp;
	private String pds;
	
	public PacienteBean() {
		nome = "";
		ncp = "";
		esp = "";
		pds = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNcp() {
		return ncp;
	}
	public void setNcp(String ncp) {
		this.ncp = ncp;
	}
	public String getEsp() {
		return esp;
	}
	public void setEsp(String esp) {
		this.esp = esp;
	}
	public String getPds() {
		return pds;
	}
	public void setPds(String pds) {
		this.pds = pds;
	}
}
