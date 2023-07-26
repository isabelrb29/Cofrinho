package Uninter;

public class Euro extends Moeda {
	//construtor
	public Euro(double valor) {
		super(valor);
		this.valor = valor;
	}

	//metodo que mostra os valores da moeda euro
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}
	
	//metodo para converter os valores para real
	public double converter() {
		return this.valor * 5.20;
	}
	
	//metodo que compara os valores dos objetos para que assim sejam usados em uma possivel remocao
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		Euro objEuro = (Euro) objeto;
		if(this.valor != objEuro.valor) {
			return false;
		}
		return true;
	}
	

}
