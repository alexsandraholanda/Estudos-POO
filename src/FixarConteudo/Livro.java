package FixarConteudo;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPags;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	
	public Livro(String titulo, String autor, int totalPags, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.aberto = false;
		this.pagAtual = 0;
		this.totalPags = totalPags;
		this.leitor = leitor;
	}


	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, "
				+ "totalPags=" + totalPags + ", pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "]";
	}


	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int pag) {
		if (pag > this.totalPags) {
			this.pagAtual = 0;
		}else {		
			this.pagAtual = pag;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}


	@Override
	public void voltarPag() {
		this.pagAtual--;
	}

	

}
