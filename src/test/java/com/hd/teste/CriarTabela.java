package com.hd.teste;

import javax.persistence.Persistence;

public class CriarTabela {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("Projeto_hd");
	}

}
