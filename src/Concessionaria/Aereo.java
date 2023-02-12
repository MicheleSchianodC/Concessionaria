package Concessionaria;

public class Aereo extends Veicolo implements Volante{

	//------ attributi ------------//
	
	private int capienza;
	
	private int cappelliere;
	
	//---------- costruttori -------------//
	
	public Aereo () {
		
	}
	public Aereo (int identificatore,String marca,String modello,int capienza,int cappelliere) {
		super(identificatore,marca,modello);
		this.capienza=capienza;
		this.cappelliere=cappelliere;
		
	}
	
	
	//----------- metodi ---------------------//
	
	@Override
	
	public void accelera() {
		System.out.println("Manipola motore va avanti");
	}
	
	@Override
	
	public void decelera() {
		System.out.println("Manipola motore torna in posizione 0");
	}

	@Override
	
	public void decolla() {
		System.out.println("Ruote si staccano dall'asfalto");
	}
	
	
	@Override
	public String toString() {
		return super.toString()+", capienza:"+capienza+", cappelliere "+cappelliere;
	}

}
