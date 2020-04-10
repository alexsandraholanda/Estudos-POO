package heranca;

public class ProjetoPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		
		
		p2.setNome("Kaio");
		p2.setMatricula(1234);

		
		System.out.println(p2.toString());
		
		
	}

}
