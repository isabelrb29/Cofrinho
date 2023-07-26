package Uninter;

public abstract class Moeda {
	//variavel
	protected double valor;
	
	//construtor
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	//metodos abstratos
	public abstract void info();
	
	public abstract double converter();
	
	

}
