
public class Doctor extends Person{
	
	int doctorId;
	
	@Override
	public void add(Person person) {
		
		System.out.println("Ho�geldiniz "+ person.getName());
		
	}

}
