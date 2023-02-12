package Concessionaria;

public class Auto extends Veicolo implements Drift{

	//--------- attributi ------------//
	
	private String pneumatici;
	
	private int posti;
	
	private int portiere;
	
	//----------- costruttori ---------//
	
	public Auto() {
		
	}
	public Auto(int identificatore,String marca,String modello,String pneumatici,int posti,int portiere) {
		super(identificatore,marca,modello);
		this.pneumatici=pneumatici;
		this.posti=posti;
		this.portiere=portiere;
	}
	
	//--------- metodi ------------------------//
		
	@Override
	
	public void accelera() {
		System.out.println("Pedale acceleratore si abbassa");
	}
	
	@Override
	
	public void decelera() {
		System.out.println("Pedale acceleratore si alza");
	}


	@Override
	
	public void Drifting() {
		System.out.println("Ruote posteriori perdono aderenza");
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+", pneumatici: "+pneumatici+", numero posti : "+posti+", numero portiere: "+portiere;
	}
}
