package polimofismo;

public class Mamifero extends Animal {
	private String corDoPelo;
	
	@Override
	public void alimentar() {
		System.out.println("Os Mamiferos alimenta-se mamando.");
	}

	@Override
	public void locomover() {
		System.out.println("Os Mamiferos (na maioria das vezes) se locomove correndo.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitir som de mamifero");
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	
}
