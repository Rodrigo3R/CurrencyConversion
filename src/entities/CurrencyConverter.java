package entities;

public class CurrencyConverter {
	
	public double priceDolar;
	
	public double converter(double amount) {
		double soma = priceDolar * amount;
		return soma  * 0.06 + soma;
	}
}
