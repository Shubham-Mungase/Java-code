package map;

public class Book {
	private int bid,qty;
	private String bname,author,pulisher;
	public Book(int bid, int qty, String bname, String author, String pulisher) {
		super();
		this.bid = bid;
		this.qty = qty;
		this.bname = bname;
		this.author = author;
		this.pulisher = pulisher;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPulisher() {
		return pulisher;
	}
	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", qty=" + qty + ", bname=" + bname + ", author=" + author + ", pulisher="
				+ pulisher + "]";
	}
	
}
