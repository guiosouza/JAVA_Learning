package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufacturedDate;
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");


	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() 
				+ " (used) $ " + super.getPrice() 
				+ " (Manufacture date: " + sdf1.format(manufacturedDate)
				+ ")";
	}
}
