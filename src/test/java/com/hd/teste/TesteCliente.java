package com.hd.teste;

import java.util.ArrayList;
import java.util.List;
import com.hd.projeto_hd.modelo.Cliente;
import com.hd.projeto_hd.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<Cliente>();

		for (int cont = 0; cont < 2; cont++) {
			Cliente cliente = new Cliente();
			cliente.setNome("José");
			cliente.setTelefone("32361849");
			cliente.setObservacao("Frisks Carne ");

			/*
			 * for(int i = 0 ; i < cliente.getTelefone().length(); i++) { char c =
			 * cliente.getTelefone().charAt(i); //System.out.println(i + " " + c); String id
			 * = cliente.getTelefone().substring(12); System.out.println(id); }
			 */

			Endereco endereco = new Endereco();
			endereco.setBairro("Carlito");
			endereco.setNumeroCasa("30");
			endereco.setRua("Oriente");
			endereco.setReferencia("Proxio");
			cliente.setEndereco(endereco);

			clientes.add(cliente);

		}

		for (Cliente cliente2 : clientes) {
			// String id = cliente2.getTelefone().substring(12);

			// System.out.println("ID " + cliente2.getId(Long.valueOf(id)));
			System.out.println("ID" + cliente2.getTelefone());
			System.out.println("nome: " + cliente2.getNome());
			System.out.println("telefone: " + cliente2.getTelefone());
			System.out.println("bairro: " + cliente2.getEndereco().getBairro());
			System.out.println("rua: " + cliente2.getEndereco().getRua());
			System.out.println("numero da casa: " + cliente2.getEndereco().getNumeroCasa());
			System.out.println("referencia: " + cliente2.getEndereco().getReferencia());
			System.out.println("-----------------------------------------------------");

		}

	}
}
