package Uninter;

import java.util.ArrayList;

public class Cofrinho {
	//declarando a lista de moedas
	private ArrayList<Moeda> listaMoedas;
	
	//construtor
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	//Metodo: adicionar moedas
	public void adicionar(Moeda x) {
		this.listaMoedas.add(x);
	}
	
	//Metodo: remover moedas
	public void remover(Moeda x) {
		this.listaMoedas.remove(x);
	}
	
	//Metodo: listar moedas
	public void listagemMoedas() {
		//retornando um valor para caso a lista esteja vazia
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio!");
			return;
		}
		
		//passando por todos os objetos da lista e chamando o metodo info() para listar as moedas
		for(Moeda x: this.listaMoedas) {
			x.info();
		}
	}
	
	//Metodo: converter para real
	public double totalConvertido() {
		//retornando um valor para caso a lista esteja vazia
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double total = 0;
		//convertendo todos os valores e os adicionando em uma variavel acumuladora
		for (Moeda x : this.listaMoedas) {
			total += x.converter();
		}
		return total;
	}
}
