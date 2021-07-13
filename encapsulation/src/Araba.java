
public class Araba {
	
	private String model;
	private String renk;
	private int kapilar;
	private int tekerler;
	private String motor;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getKapilar() {
		return kapilar;
	}
	public void setKapilar(int kapilar) {
		if(kapilar<0) {
			
			System.out.println("Kapý deðeri 0'dan küçük olamaz");
		}else {
			
			this.kapilar = kapilar;

		}
		
	}
	public int getTekerler() {
		return tekerler;
	}
	public void setTekerler(int tekerler) {
		this.tekerler = tekerler;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	
	
}
	

