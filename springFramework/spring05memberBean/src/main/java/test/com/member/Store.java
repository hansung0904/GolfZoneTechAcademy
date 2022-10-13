package test.com.member;

public class Store {

	public Car car;
	public Book book;

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
