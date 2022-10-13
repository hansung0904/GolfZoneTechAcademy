package test.com.createbean;

public class Store2 {

	private Car car;
	private Book book;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Store2 [car=" + car + ", book=" + book + "]";
	}

}
