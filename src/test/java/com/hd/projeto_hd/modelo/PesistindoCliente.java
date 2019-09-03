package com.hd.projeto_hd.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hd.projeto_hd.EntityManagerFactory.JpaUtil;

public class PesistindoCliente {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.geEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Cliente cliente = new Cliente();
		cliente.setNome("maria");
		cliente.setTelefone("9 5225-2563");
		
		manager.persist(cliente);
		
		tx.commit();
		manager.close();
		JpaUtil.close();
	}

}
