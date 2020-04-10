package FixarConteudo;

public class projetoLivro {
	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa[3];
		Livro [] l = new Livro [3];
		
		p[0] = new Pessoa("Alexsandra", 28, "feminino");
		p[1] = new Pessoa("Kaio", 12, "masculino");
		
		l[0] = new Livro("Aprendendo Java", "Desconhecido", 300, p[0]);
		l[1] = new Livro("Aprendendo POO", "Lucas C.", 350, p[0]);
		l[2] = new Livro("Logica de Programação", "Antonio H. ", 250, p[1]);
		
		l[0].abrir();
		l[0].folhear(380);
		System.out.println(l[0].detalhes());
	
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());


	}
}
