package p2;

public class Camera extends ElectronicDevice{
	
	Memory memory;
	Bluetooth bluetooth;
	public Camera() {
		super();
	}
	public Camera(String name, int power, int rating, int price,Memory m, Bluetooth b) {
		super(name, power, rating, price);
		this.memory = memory;
		this.bluetooth = bluetooth;
	}
	public Memory getM() {
		return memory;
	}
	public void setM(Memory memory) {
		this.memory = memory;
	}
	public Bluetooth getB() {
		return bluetooth;
	}
	public void setB(Bluetooth b) {
		this.bluetooth =bluetooth;
	}

	
	
}
