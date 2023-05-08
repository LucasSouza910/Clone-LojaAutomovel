package controller;

import model.Automovel;

public class Loja {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//1000 Auto-generated method stud
		Automovel a = new Automovel();
		a.setMarca("Chevrolet");
		a.setModelo("Celta");
		a.setTipo("Passeio");
		System.out.println("Marca: " + a.getMarca() + "Modelo: " + a.getModelo() + "Tipo: " + a.getTipo());
	
		Automovel b = a.clone();
		System.out.println("Marca: " + b.getMarca());
		
		b.setModelo("Montana");
		System.out.println("Marca: " + b.getMarca() + "Modelo: " + b.getModelo() + "Tipo: " + a.getTipo());
	}

}
