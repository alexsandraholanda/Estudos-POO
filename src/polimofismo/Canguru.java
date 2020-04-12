package polimofismo;

public class Canguru extends Mamifero {

	public void usarBolsa() {
		System.out.println("Tem uma bolsa.");
	}
	
	@Override
	public void locomover() {
		System.out.println("Se locomose saltando.");
	}
}
