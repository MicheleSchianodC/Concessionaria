package Concessionaria;

public abstract class Veicolo {
	
	
	public  void Inizializzatore() {
		
	}
	
	static {
			System.out.println("Benvenuti in Schiano Motors");
			System.out.println(" ");
		}
			
		
	private int identificatore;
	private String marca;
	private String modello;
	
	
	public Veicolo() {
		
	}
	public Veicolo(int identificatore,String marca,String modello) {
		
		this.identificatore=identificatore;
		this.marca=marca;
		this.modello=modello;
	}
	
	public abstract void accelera();
	
	public abstract void decelera();
	
	
	
	
	
	
	public int getIdentificatore() {
		return identificatore;
	}
	public void setIdentificatore(int identificatore) {
		this.identificatore = identificatore;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	
	@Override
	public String toString() {
		return "Veicolo identificatore: " + identificatore + ", marca: " + marca + ", modello: " + modello;
	}
	
		
}
