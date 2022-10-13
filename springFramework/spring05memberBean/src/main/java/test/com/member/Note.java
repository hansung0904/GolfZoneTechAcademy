package test.com.member;

public class Note {

	private String model;
	private int size;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Note [model=" + model + ", size=" + size + "]";
	}

}
