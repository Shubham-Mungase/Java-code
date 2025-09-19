package Assignment2;

public class Book {
	String title,author;
	float price;
	
	
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, float price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Book b1=new Book("Wings of fire","Dr Apj Abdul Kalam");
		System.out.println(b1);
		Book b2=new Book("xyz","abc",3000f);
		System.out.println(b2);
				
	}
	
	

}
