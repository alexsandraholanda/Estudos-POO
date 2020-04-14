package praticandoConceitos;

public class Visualizacao {
	private Aluno espectador;
	private VideoAula filme;
	
	
	public Visualizacao(Aluno espectador, VideoAula filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setToAssistindo(this.espectador.getToAssistindo() + 1);
		this.filme.setVisualizacao(this.filme.getVisualizacao() + 1);
	}

	
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public Aluno getEspectador() {
		return espectador;
	}

	public void setEspectador(Aluno espectador) {
		this.espectador = espectador;
	}

	public VideoAula getFilme() {
		return filme;
	}

	public void setFilme(VideoAula filme) {
		this.filme = filme;
	}
	
	
}
