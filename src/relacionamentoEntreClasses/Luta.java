package relacionamentoEntreClasses;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int raunds;
	private boolean aprovada;
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if ((l1.getCategoria() == l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada == true) {
			System.out.println("#### DESAFIANTE ####");
			this.desafiante.apresetar();
			System.out.println("#### DESAFIADO ####");
			this.desafiado.apresetar();
			
			Random aleatorio = new Random();
			int vencendor = aleatorio.nextInt(3);
			System.out.println("========== RESULTADO DA LUTA ==========");
			switch (vencendor) {
			case 0:
				System.out.println("EMPATOU!!!");
				this.desafiado.empatarLutar();
				this.desafiado.empatarLutar();
				break;
				
			case 1:
				System.out.println("O DESAFIADO " + this.desafiado.getNome() +" ganhou a luta!!!");
				this.desafiado.ganharLuta();
				this.desafiante.pederLuta();
				break;
				
			case 2:
				System.out.println("DESAFIANTE " + this.desafiante.getNome() + " ganhou a luta!!!");
				this.desafiado.pederLuta();
				this.desafiante.ganharLuta();
				break;

			default:
				break;
			}
			
		}else {
			System.out.println("A luta não pode acontecer!!! ");
		}
		System.out.println("======================================");

	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRaunds() {
		return raunds;
	}

	public void setRaunds(int raunds) {
		this.raunds = raunds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
