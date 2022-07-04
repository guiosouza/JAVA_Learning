package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	// CONTEM 1
	private Product product;

	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return price * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return product.getName() 
				+ ", $"
				+ price
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ subTotal();
	}
}
