package com.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
//	
//	@OneToOne
//	(cliente.id)
	private String rua;
	private int   numero;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	private String cep;
	
	

}
