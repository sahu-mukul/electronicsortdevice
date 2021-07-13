package p2;

public class MobilePhone extends ElectronicDevice {
	
	Memory memory;
	Bluetooth bluetooth;
	
	
	public MobilePhone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MobilePhone(String name, int power, int rating, int price,Memory m, Bluetooth b) {
		super(name, power, rating, price);
		// TODO Auto-generated constructor stub
		this.memory = memory;
		this.bluetooth = bluetooth;
	}

	
	public Memory getM() {
		return memory;
	}


	public void setM(Memory m) {
		this.memory = memory;
	}


	public Bluetooth getB() {
		return bluetooth;
	}


	public void setB(Bluetooth b) {
		this.bluetooth = bluetooth;
	}
		
}
