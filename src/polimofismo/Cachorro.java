package polimofismo;

public class Cachorro extends Lobo {
	
	public void abanarRabo() {
		System.out.println("Abanar o rabo.");
	}
	
	public void esconderOsso() {
		System.out.println("Esconde osso.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au.. au.. au");
	}
	
	public void reagir(String frase) {
		if (frase == "olá" || frase== "oi, amigo.") {
			System.out.println("Abanar o rabo e latir.");
		}else {
			System.out.println("Rosnar.");
		}
	}

	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar o rabo.");
		} else {
			System.out.println("Rosnar e latir.");
		}
	}
	
}
