package polimofismo;

public class Ave extends Animal{
	private String corDaPena;

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
		System.out.println("Emitir som de aves.");
	}
	
	public void fazerNinho() {
		System.out.println("Construir ninho.");
	}

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}	
	
}
