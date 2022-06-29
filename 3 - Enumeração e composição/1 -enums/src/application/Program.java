package application;

import java.text.ParseException;
import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// INSTANCIANDO OBJETO QUE POSSUI E ENUMS
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDINDING_PAYMENT);
		
		// - Veja que JAVA transforma o enum para o mesmo nome que foi declarado
		System.out.println(order);
		System.out.println();
		
		// CONVERTENDO UM STRING PARA ENUM - Instanciando a classe ENUM
		// Ele pega a string e procura esse valor na classe OrderStatus
		OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
		OrderStatus os2 = OrderStatus.DELIVERED;
		
		// Comparando para mostrar que valem a mesma coisa
		System.out.println(os1);
		System.out.print(os2);
	}	
	
}