package relacionamentoEntreClasses;

public class LutaPrincipal {

		public static void main(String[] args) {
			
			Lutador lutador[] = new Lutador[6];
			
			lutador[0]= new Lutador ("Mitchel", "Brasileiro", 30, 1.75f, 68.8f, 2, 1, 2);
			lutador[0].status();
			lutador[1]= new Lutador ("Toinho", "Brasileiro", 33, 1.79f, 69.8f, 0, 1, 4);
			lutador[1].status();
			lutador[2]= new Lutador ("Pupi", "Brasileiro", 25, 1.69f, 75.8f, 1, 2, 2);
			lutador[2].status();
			lutador[3]= new Lutador ("Nego", "Brasileiro", 31, 1.79f, 69.8f, 1, 0, 4);
			lutador[3].status();
			lutador[4]= new Lutador ("Pingo", "Brasileiro", 28, 1.79f, 80.8f, 0, 1, 4);
			lutador[4].status();
			lutador[5]= new Lutador ("Bob", "Brasileiro", 36, 1.79f, 72.8f, 0, 1, 4);
			lutador[5].status();
			
			Luta luta01 = new Luta();
			luta01.marcarLuta(lutador[0], lutador[1]);
			luta01.lutar();
			lutador[0].status();
			lutador[1].status();
			
		}
}
