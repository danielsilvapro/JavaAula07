package br.com.danielsilva;

public interface TesteFuncionario {
	public static void main(String[] args){
		Engenheiro fulano = new Engenheiro();
		fulano.setNome("Fulano");
		fulano.setSalario(5000.00);
		
		Gerente ciclano = new Gerente();
		ciclano.setNome("Ciclano");
		ciclano.setSalario(3000.00);
		
		Vendedor beltrano = new Vendedor();
		beltrano.setNome("Beltrano");
		beltrano.setSalario(4000.00);
		
		Funcionario mingano = new Engenheiro();
		mingano.setNome("Mingano");
		mingano.setSalario(4500.00);
		
		System.out.println(fulano.quantiaApagar());
		System.out.println(ciclano.quantiaApagar());
		System.out.println(beltrano.quantiaApagar());
		System.out.println(mingano.quantiaApagar());
	}

}
