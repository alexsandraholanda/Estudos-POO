package praticandoConceitos;

public class Aluno extends Pessoa {
	private String login;
	private int toAssistindo;
	
	
	public Aluno(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.toAssistindo = 0;
	}
	

	@Override
	public String toString() {
		return "Aluno [login=" + login + ", toAssistindo=" + toAssistindo + ", nome=" + nome + ", idade=" + idade
				+ ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}



	private void viuMaisUm() {
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistindo() {
		return toAssistindo;
	}

	public void setToAssistindo(int toAssistindo) {
		this.toAssistindo = toAssistindo;
	}
	
	
}
