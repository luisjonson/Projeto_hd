package com.hd.projeto_hd.modelo;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private double salario;
	private String cargo;
	private List<BancoHora> bancoHoras = new ArrayList<BancoHora>();

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<BancoHora> getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(List<BancoHora> bancoHoras) {
		this.bancoHoras = bancoHoras;
	}
	
	public Object calcularHoraDia() {
		
		return null;
	}

}
