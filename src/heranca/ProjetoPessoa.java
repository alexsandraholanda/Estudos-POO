package heranca;

public class ProjetoPessoa {
	
	public static void main(String[] args) {
		
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		
		p2.setNome("Kaio");
		p2.setMatricula(1234);
		System.out.println(p2.toString());
		
		Visitante v1 =  new Visitante();
		v1.setNome("Maria");
		System.out.println(v1.getNome());
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Mitchelly");
		b1.pagarMensalidade();
		
	}

}
