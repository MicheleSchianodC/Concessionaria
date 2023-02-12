package Concessionaria;

public class Main {

	public static void main(String[] args) {
		
		Veicolo a1 = new Auto(1111, "BMW", "Mquattro", "Michelin", 5, 5);
		
		Veicolo m1 = new Moto(2222, "Yamaha", "XT", "Motard",0);
		
		Veicolo b1 = new Aereo(3333,"Boeing", "Settesettesette", 368,100);

		
		Concessionaria catalogo = new Concessionaria();
		
		
		catalogo.aggiungeVeicolo(a1);
		catalogo.aggiungeVeicolo(m1);
		catalogo.aggiungeVeicolo(b1);
		
		
				
	
	}

		public static void azione(Veicolo v) {
			if(v instanceof Auto) {
				Auto v1 = (Auto) v;
				v1.Drifting();
			}
			if(v instanceof Moto) {
				Moto v2 = (Moto) v;
				v2.Impenna();
			}
			if(v instanceof Aereo) {
				Aereo v3 = (Aereo) v;
				v3.decolla();
			}
		}
	
}
