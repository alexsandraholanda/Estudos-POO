package polimofismo;

public abstract  class Animal {
	private float peso;
	private int idade;
	private int qtdMembros;
	
public abstract void alimentar();
public abstract void locomover();
public abstract void emitirSom();
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getQtdMembros() {
		return qtdMembros;
	}
	public void setQtdMembros(int qtdMembros) {
		this.qtdMembros = qtdMembros;
	}
	
	
}
