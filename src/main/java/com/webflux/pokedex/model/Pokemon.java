package com.webflux.pokedex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pokemon {
	@Id
	private String id;
	private String nome;
	private String categoria;
	private String habilidade;
	private Double peso;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String id, String nome, String categoria, String habilidade, Double peso) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.habilidade = habilidade;
		this.peso = peso;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getHabilidade() {
		return habilidade;
	}
	
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", habilidade=" + habilidade
				+ ", peso=" + peso + "]";
	}
	
	
	
}
