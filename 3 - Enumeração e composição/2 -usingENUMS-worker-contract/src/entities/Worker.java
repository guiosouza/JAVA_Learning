package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	// AGORA AS ASSOCIAÇÕES -------------------------
	
	// Worker tem 1 departamento
	private Department department;
	
	/* - Worker tem vários HourContract
	 * - Vamos usar uma lista para isso;
	 * - na composição, não usamos lista no construtor
	 * - isso porque ainda não temos os contracts
	 * - a lista é instanciada quando criamos o objeto Worker
	*/ 
	private List<HourContract> contracts = new ArrayList<>();
	
	
	// CONSTRUTORES
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	
	// GETTERS E SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// NÃO HAVERA setContracts(), SENÃO SERÁ CRIADA UMA NOVA LISTA!
	
	// -------------------------------------------------
	
	/* MÉTODO PARA ADD CONTRATO ASSOCIADO AO TRABALHADOR
	 * - Pega a lista e adiciona o contrato
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	/* MÉTODO PARA REMOVER CONTRATO ASSOCIADO AO TRABALHADOR
	 * - Pega a lista e adiciona o contrato
	 */
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	// Salário base + contratos;
	public double income(int year, int month) {
		double sum = baseSalary;
		/* - Para cada "HourContract" da lista "c" do tipo "contracts"
		 * - vou testar se c corresponde (int year, int month)
		 * - caso ele seja, vou acrescentar na soma "sum"
		 */
		
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			
			// peguei data contrato
			// e defini como data do calendário
			cal.setTime(c.getDate());  
			
			int c_year = cal.get(Calendar.YEAR); 
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			// Se for do mês e ano
			if (year == c_year && month == c_month) {
				// como extrair o ano e mês? vamos usar o calendar: olhe acima
				sum = sum + c.totalValue();
			}
			
		}
		return sum;
	} 
}
