package br.com.danielsilva;

public class Gerente extends Funcionario{

	@Override
	public double quantiaApagar() {

		return this.getSalario() +400;
	}
}
