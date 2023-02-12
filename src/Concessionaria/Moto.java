package Concessionaria;

public class Moto extends Veicolo implements DueRuote{

	//------ attributi --------//
	
	private String tipo;
	
	private int borselaterali;
	//--------- costruttori -------//
	
	public Moto() {
		
	}
	public Moto(int identificatore,String marca,String modello,String tipo,int borselaterali) {
		super(identificatore,marca,modello);
		this.tipo=tipo;
		this.borselaterali=borselaterali;
	}
	
	
	//----------- metodi ---------------//
	
	@Override
	
	public void accelera() {
		System.out.println("La manipola si gira");
	}
	public void decelera() {
		System.out.println("La manipola torna in posizione originale");
	}

	@Override
	
	public void Impenna() {
		System.out.println("Ruota anteriore si alza");
	}
	
	
	@Override
	public String toString() {
		return super.toString()+", tipo: "+tipo+", numero borse laterali: "+borselaterali;
	}

}
