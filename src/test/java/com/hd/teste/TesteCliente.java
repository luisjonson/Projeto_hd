package com.hd.teste;

import java.util.ArrayList;
import java.util.List;

import com.hd.projeto_hd.modelo.Cliente;
import com.hd.projeto_hd.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("joão");
		cliente.setTelefone("(85) 9 8586-5097");
		
	/*for(int i = 0 ; i  < cliente.getTelefone().length(); i++) {			
			char c = cliente.getTelefone().charAt(i);
			//System.out.println(i + " " + c);
			String id = cliente.getTelefone().substring(12);
			System.out.println(id);
		}
		*/
		Endereco endereco = new Endereco();
		endereco.setBairro("Carlito");
		endereco.setNumeroCasa("36");
		endereco.setRua("Oriente");
		endereco.setReferencia("Proximo a caixa d'gua");
		
		cliente.setEnderecoId(endereco);
		clientes.add(cliente);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Mara");
		cliente1.setTelefone("(85) 9 6575-9459");
		
				
		Endereco endereco1 = new Endereco();
		endereco1.setBairro("goiabeira");
		endereco1.setNumeroCasa("400");
		endereco1.setRua("coco verde");
		endereco1.setReferencia("Proximo a praia ");
		
		cliente1.setEnderecoId(endereco1);
		clientes.add(cliente1);
		
		for (Cliente cliente2 : clientes) {
			String id = cliente2.getTelefone().substring(12);
			
			System.out.println("ID " + cliente2.getId(Long.valueOf(id)));
			System.out.println("nome: "+cliente2.getNome());
			System.out.println("telefone: "+cliente2.getTelefone());
			System.out.println("bairro: "+cliente2.getEnderecoId().getBairro());
			System.out.println("rua: "+cliente2.getEnderecoId().getRua());
			System.out.println("numero da casa: "+cliente2.getEnderecoId().getNumeroCasa());
			System.out.println("referencia: "+cliente2.getEnderecoId().getReferencia());
			System.out.println("-----------------------------------------------------");
			
		}
		
	}

}
