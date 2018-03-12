package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {
	
	private long id;
	private String nome;
	private int anoDeIncio;
	
	public Projeto(long id, String nome, int anoDeIncio) {
		this.id = id;
		this.nome = nome;
		this.anoDeIncio = anoDeIncio;
	}

	public Projeto() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

	public int getAnoDeIncio() {
		return anoDeIncio;
	}

	public void setAnoDeIncio(int anoDeIncio) {
		this.anoDeIncio = anoDeIncio;
	}
	
	
	public String toXML() {
		return new XStream().toXML(this);
	}

}
