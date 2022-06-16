package entities;

public class Dolar {
	
	public static final double PI = 3.14159; 
	
	public static double calculatorDolar(double value, double quantity) {
		double valueRaw = value * quantity;
		return valueRaw = valueRaw + (valueRaw *0.06);
	}

}
