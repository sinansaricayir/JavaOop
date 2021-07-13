
public class Patient extends Person{
	
	int patientNumber;
	
	@Override
	public void add(Person person) {
		
		System.out.println("Hoþgeldiniz "+ person.getName());
	}

	
}
