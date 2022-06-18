package entities;

public class Bhaskara {
	
		private double a;
		private double b;
		private double c;
		private double x1;
		private double x2;
		


	public Bhaskara(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}


	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}


	public void calculator(int equationType) {
		double delta;
		delta = (b * b) - (4 * a * c);
		switch(equationType) {
			case 1:
				x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
				x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
				break;
			case 2:
				x1 = + Math.sqrt(- c / a);
				x2 = - Math.sqrt(- c / a);
				break;
			case 3:
				x1 = 0;
				x2 = (-b) / a;
				break;
		}
	}

	public String toString() {
		return 
				"Result: X1 = " 
				+ x1
				+ ", "
				+ "X2 = "
				+ x2;
	}
}
