package polimofismo;

public class Mamifero extends Animal {

	
	
	@Override
	public void alimentar() {
		System.out.println("Os Mamiferos alimenta-se de leite.");

	}

	@Override
	public void locomover() {
		System.out.println("Os Mamiferos (na maioria das vezes) se locomove correndo.");

	}

	@Override
	public void emitirSom() {

	}

}
