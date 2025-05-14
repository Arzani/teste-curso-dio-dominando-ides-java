package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*int a = 1;
		int b = 3;
		System.out.println("Hello World!" + " = " + (a+b));*/
		
		
		Gato gato = new Gato();
		
		gato.setCor("Amarelo");
		String corGato = gato.getCor();
		
		
		System.out.println(corGato);
		
	}

}
