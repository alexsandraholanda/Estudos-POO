package praticandoConceitos;

public class ProjetoYouTube {
	public static void main(String[] args) {
		
		VideoAula v[] = new VideoAula[3];
		v[0] = new VideoAula("Curso de POO");
		System.out.println(v[0].getTitulo());
		
		v[1] = new VideoAula("Curso de Java Básico");
		System.out.println(v[1].getTitulo());
		
		v[2] = new VideoAula("Curso de JavaScript");
		System.out.println(v[2].getTitulo());
		
		
		Aluno a[] = new Aluno[2];
		a[0] = new Aluno("Alexsandra", 15, "F", "Alex");
		System.out.println(v[0].toString());
	}
}
