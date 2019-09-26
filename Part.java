
public class Part {
	
	private int number;
	private String name;
	private int quantity;
	
	public Part(int number, String name, int quantity) {
		
		this.number = number;
		this.name = name;
		this.quantity = quantity;
	}
	
	public Part(int number, String name) {
		this(number,name, 0);
	}
	/**
	public Part() {
		
		this(0, 'No name');
	}
	
	public void decreaseQuantity(int amount) {
		quantity =- amount;
	}
	
	public int getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	public int getQuantity() {
		return quantity;
	}
**/
}


