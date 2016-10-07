package br.com.danielsilva;

public class Engenheiro extends Funcionario {
	
	@Override
	public double quantiaApagar() {

		return this.getSalario() + 1000;
	}

}
