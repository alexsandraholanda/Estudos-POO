package polimofismo;

public class AnimalPrincipal {
	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Ave a = new Ave();
		Cachorro c = new Cachorro();
		Canguru ca = new Canguru();
		
		m.alimentar();
		a.alimentar();
		
		c.locomover();
		ca.locomover();
	
		
		
	}
}
