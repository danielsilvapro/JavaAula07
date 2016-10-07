package br.com.danielsilva;

public class Vendedor extends Funcionario {

	@Override
	public double quantiaApagar() {

		return this.getSalario() +500;
	}
}
