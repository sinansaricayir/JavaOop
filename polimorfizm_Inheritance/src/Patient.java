
public class Patient extends Person{
	
	int patientNumber;
	
	@Override
	public void add(Person person) {
		
		System.out.println("Ho�geldiniz "+ person.getName());
	}

	
}
