package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private double valuePerHour;
	private Integer hours;
	
	// CONSTRUTORES
	
	public HourContract() { // garantir que os valores não fiquem nulos;

	}
	
	public HourContract(Date date, double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	// GETTERS E SETTERS
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	// VALOR TOTAL DO CONTRATO
	public double totalValue() {
		return valuePerHour * hours;
	}
}
