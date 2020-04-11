package polimofismo;

public class Ave extends Animal{

	@Override
	public void alimentar() {
		System.out.println("As aves alimenta-se de sementes.");
	}

	@Override
	public void locomover() {
		System.out.println("As aves (na maioria das vezes) se locomove voado.");

	}

	@Override
	public void emitirSom() {
		
	}

	
	
}
