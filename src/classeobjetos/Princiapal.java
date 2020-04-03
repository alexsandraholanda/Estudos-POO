package classeobjetos;

public class Princiapal {
	
	public static void main(String[] args) {
		
		ContaBanco conta1 = new ContaBanco();
		conta1.setNumConta(001);
		conta1.setNomeDono("Alexsandra");
		conta1.abrirConta("CC");
		//conta1.depositar(100);
		conta1.sacar(30);
		conta1.estadoAtual();
		
		ContaBanco conta2 = new ContaBanco();
		conta2.setNumConta(002);
		conta2.abrirConta("CP");
		conta2.setNomeDono("Kaio");
		conta2.pagarMensalidade();
		conta2.estadoAtual();
		
	}

}
