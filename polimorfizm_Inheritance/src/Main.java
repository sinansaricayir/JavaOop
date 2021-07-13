
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient hasta = new Patient();
		hasta.name="Sinan";
		
		Doctor doktor = new Doctor();
		doktor.name="Doktor Ali";

		PersonManager test = new PersonManager();
		test.show(doktor);
		test.show(hasta);
		
		
		
	}

}
