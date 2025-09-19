package day11;

public class Publication {

	private String title;
	private float price;
	
	
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publication(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Publication [title=" + title + ", price=" + price + "]";
	}
	
	
}
