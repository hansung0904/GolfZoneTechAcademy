package test.com.createbean;

public class Store {

	private Car car;
	private Book book;

	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(Car car, Book book) {
		this.car = car;
		this.book = book;
	}

	@Override
	public String toString() {
		return "Store [car=" + car + ", book=" + book + "]";
	}

}
