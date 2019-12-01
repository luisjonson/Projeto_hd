package com.hd.projeto_hd.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	private Long id;
	private String nome;
	private String telefone;
	private Endereco enderecoId;

	@Id
	@GeneratedValue
	public Long getId(Long id) {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(length = 50, nullable = true)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(length = 10, nullable = true)
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Endereco enderecoId) {
		this.enderecoId = enderecoId;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
