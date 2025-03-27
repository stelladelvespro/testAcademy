package test;

// La classe Immagine estende MultimedialeBase ma non ci interessa la 
// riproducibilità: non viene implementata l'interfaccia Riproducibile.

public class Immagine extends MultimedialeBase {
	
	private int luminosità; 

	public Immagine(String titoloElemento, int luminosità) {
		super(titoloElemento); 
		this.luminosità = luminosità;
	}

	// Aumentare e abbassare la luminosità: metodi aumentaLuminosità() e diminuisciLuminosità().
	
	// Aumentare.
	public void aumentaLuminosità() {
		luminosità++; 
	}
	
	// Diminuire. 
	public void diminuisciLuminosità() {
//		luminosità--; // Così non va bene perchè decremento senza soglia.
		if(luminosità > 0) { // Uso if per soglia inferiore per non andare sotto zero.
			luminosità--;
		}
	}
	
	// show() mostra l'immagine stampando il titolo e mostrando la luminosità tramite *.
	public void show() {
		
		String immagineOut = titoloElemento + ""; // Non mi serve nel for.
		
		for(int i = 0; i < luminosità; i++) {
			immagineOut += "*";	// Aggiungo gli asterischi.
		}
		
		System.out.println(immagineOut); 
	}
}
