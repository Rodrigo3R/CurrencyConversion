package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter c = new CurrencyConverter();
		
		System.out.println("Digite o valor do dolar:");
		c.priceDolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade a ser convertido:");
		double amount = sc.nextDouble();
		
		double soma = c.converter(amount);
		
		System.out.printf("O valor que vc vai pagar é de:%.2f",soma);
		
		sc.close();
	}

}
