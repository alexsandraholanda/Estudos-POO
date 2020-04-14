package praticandoConceitos;

public class VideoAula implements AcoesVideo {
	private String titulo;
	private int avaliacao;
	private int visualizacao;
	private int curtidas;
	private boolean reproduzindo;
	
	
	public VideoAula(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 0;
		this.visualizacao = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getVisualizacao() {
		return visualizacao;
	}

	public void setVisualizacao(int visualizacao) {
		this.visualizacao = visualizacao;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	

}
