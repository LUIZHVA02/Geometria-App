package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		
		System.out.println("Criando Triângulos");
		//Criando dois triângulos
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		//Definindo as propriedades dos triângulos
		t1.base = 20.00;
		t1.altura = 14.00;
		t1.ladoB = 10.00;
		t1.ladoC = 15.00;
		t1.nome = "Triangulo Número 1";
		
		t2.base = 34.00 ;
		t2.altura = 18.00 ;
		t2.ladoB = 12.00 ;
		t2.ladoC = 19.00 ;
		t2.nome = "Triângulo Número 2";
		
		//Exibir dados dos triângulos
		
		t1.exibirDados();
	}

}
