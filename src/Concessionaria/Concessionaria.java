package Concessionaria;

public class Concessionaria {

	Veicolo[] array = new Veicolo[3];

	
	 public void aggiungeVeicolo(Veicolo v) {                                 //ci manca la stampa dei veicoli, ossia dell'array
			
			 if(array[array.length-1] != null) {
				aumentaCapienza();
			 }
		
			   for(int i = 0; i < this.array.length; i++) {         
			 	 if(this.array[i] == null) {                      
					this.array[i] = v;
					break;
				}
			}
		}
	
	 private void aumentaCapienza() {
			Veicolo[] nuovoArray = new Veicolo[array.length+1];
			
			for(int i=0; i<array.length;i++) {
				
				nuovoArray[i]=array[i];
			}
			array=nuovoArray;                       
			                                                                     
		}
	
	 public void stampaVeicoli() {                           
			for(int i = 0; i < array.length; i++) {
	 			if(array[i] != null) {  
	 				
	 				System.out.println(array[i].toString());
	 				System.out.println("-----------------------------");
	 			}
			}
	
	 }
	
	 public void ricercaVeicolo(int numero) {
			
			for(int i = 0; i < array.length; i++) {
				if(array[i].getIdentificatore()==(numero)) {
			        System.out.println("Ecco il veicolo che stavi cercando: "+array[i].toString());
				
			}
		}
	 }
	 
	 public void ricercaVeicoloElimina(int numero) {
			
			for(int i = 0; i < array.length; i++) {
				if(array[i].getIdentificatore()==(numero)) {
			        array[i]=null;
				
			}
		}
	 
			riordinaArray();
	 
	 }
	 
	 private void riordinaArray() {
			for(int i = 0; i < array.length - 1; i++) {
				
				if(array[i] == null) {
					array[i] = array[i + 1];
					array[i + 1] = null;
				}
			}
		}
	//---------- get e setter -----------//
	public Veicolo[] getArray() {
		return array;
	}

	public void setArray(Veicolo[] array) {
		this.array = array;
	}
	
		 
}
