package relacionamentoEntreClasses;

public class Lutador {
	
	private String nome;
	private String nascionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	public Lutador(String nome, String nascionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nascionalidade = nascionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public void apresetar() {
		
		System.out.println("Chegou a hora! Apresentamos o lutador, " + this.getNome());
		System.out.println("De nascionalidade: " + this.getNascionalidade());
		System.out.println("Sua altura e peso � " + this.getAltura() +" "+ this.getPeso());
		System.out.println("Possui "+ this.getVitorias() +" Vit�rias" + " e " +
		this.getDerrotas() + "derrotas" + this.getEmpates() +"Empates");
		System.out.println("-------------------------------");

	}
	
	public void status() {
		System.out.println(this.getNome() + " � um peso " + this.getPeso());
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
		
	}
	
	public void  ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void pederLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLutar() {
		this.setEmpates(this.getEmpates() + 1);
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inv�lida";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoria = "M�dio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inv�lida";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
