package Uninter;

public class Real extends Moeda {
	//construtor
	public Real(double valor) {
		super(valor);
		this.valor = valor;
	}

	//metodo que mostra os valores da moeda real
	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}
	
	//metodo para converter os valores para real
	public double converter() {
		return this.valor;
	}
	
	//metodo que compara os valores dos objetos para que assim sejam usados em uma possivel remocao
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		Real objReal = (Real) objeto;
		if(this.valor != objReal.valor) {
			return false;
		}
		return true;
	}

}
