package Uninter;

public class Dolar extends Moeda {
	//construtor
	public Dolar(double valor) {
		super(valor);
		this.valor = valor;
	}

	//metodo que mostra os valores da moeda dolar
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
	}
	
	//metodo para converter os valores para real
	public double converter() {
		return this.valor * 4.70;
	}
	
	//metodo que compara os valores dos objetos para que assim sejam usados em uma possivel remocao
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		Dolar objDolar = (Dolar) objeto;
		if(this.valor != objDolar.valor) {
			return false;
		}
		return true;
	}

}
