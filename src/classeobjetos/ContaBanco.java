package classeobjetos;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String nomeDono;
	private float saldo;
	private boolean status;
		
	public ContaBanco() {
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	public void estadoAtual() {
	
		System.out.println("-----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Nome: " + this.getNomeDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: "+ this.getStatus());	
		System.out.println("-----------------------------");

	}
	
		public void abrirConta(String t) {
			this.setTipo(t);
			this.setStatus(true);
				if (t.equals("CC")) {
					this.setSaldo(50);
				}else if (t.equals("CP")) {
					this.setSaldo(150);
				}
			System.out.println("Conta aberta com sucesso.");
		}
		
		public void fecharConta() {
			if (this.getSaldo() > 0) {
				System.out.println("Impossivel fechar conta, ainda existe saldo.");
			} else if(this.getSaldo() < 0) {
				System.out.println("Impossivel fechar conta, ainda existe saldo.");
				}else {
					this.setStatus(false);
					System.out.println("Conta fechada com sucesso.");
				}
		}
		
		public void depositar(float valor) {
			if (this.getStatus() == true) {
				this.setSaldo(this.getSaldo() + valor);
				System.out.println("Deposito realizado na conta do(a) " + this.getNomeDono());
			} else {
				System.out.println("Impossivel realizar deposito, conta encerrada");
			}
		}
		
		public void sacar(float valor) {
			if (this.getStatus() == true) {
				if (this.getSaldo() >= valor) {
					this.setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado na conta do(a) : " +this.nomeDono);
				}else {
					System.out.println("Saldo indisponivel.");
				}
			}else {
				System.out.println("Impossivel sacar de uma conta fechada.");
			}
		}
		
		
		public void pagarMensalidade() {
			int valor = 0;
			if (this.getTipo() == "CC") {
				valor = 12;
			} else if(this.getTipo() == "CP") {
				valor = 5;
			}
			
			if (this.getStatus() == true) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Mensalidade paga com sucesso da conta do(a): " + this.getNomeDono());
			} else {
				System.out.println("Impossivel pagar mensalidade conta fechada");
			}
		}

		
		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getNomeDono() {
			return nomeDono;
		}

		public void setNomeDono(String nomeDono) {
			this.nomeDono = nomeDono;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

		public boolean getStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
		
		
	
		
		
		
		
}
