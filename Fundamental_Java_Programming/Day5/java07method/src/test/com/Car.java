package test.com;

public class Car {

	private String model;
	private String color;
	private int maxSpeed;

	public Car() {
		model = "Audi";
		color = "은색";
		maxSpeed = 250;
	}
	
	

	public Car(String model) {
		this(); // new Car();를 받고 있는 것임 new Car(); 한거에서 model 만 바꿀게~
				// super();는 Object에 super로 상속받고 있는게 있다면 그걸로 쓰겠다. Inheritance 수업 때 다시 설명
				// 오버로딩은 갯수가 같을경우 타입이 다르거나 
		this.model = model;
	}
	
	public Car(int maxSpeed) {
		this(); // this() 가 밑으로 내려갈 순 없음. super(); 도 마찬가지 왜? 생성자 초기화가 항상 먼저 일어나야함 .
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model, String color) {
		this(500);
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		this("SM7","Black");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
