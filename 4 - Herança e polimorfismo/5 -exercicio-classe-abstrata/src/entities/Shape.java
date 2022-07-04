package entities;

import entities.enums.Color;

// SE O MÉTODO É ABSTRATO, A CLASSE TAMBÉM DEVE SER
// NÃO EXISTE IMPLEMENTAÇÃO DO MÉTODO
public abstract class Shape {
	
	private Color color;

	public Shape(){
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}
