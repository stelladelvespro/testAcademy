package test;

// La classe Audio estende MultimedialeBase e ci interessa la 
// riproducibilità: viene implementata l'interfaccia Riproducibilità.

public class Audio extends MultimedialeBase implements Riproducibilità {

	private int durata; // Corrisponderà al numero di ripetizioni.
	private int volume; // Corrisponderà al numero di punti esclamativi.
	
	public Audio(String titoloElemento, int durata, int volume) {
		super(titoloElemento);
		this.durata = durata;
		this.volume = volume;
	}
	
	// Aumentare e abbassare il volume: metodi alzaVolume() e abbassaVolume().
	
	// Aumentare.
	public void alzaVolume() {
		volume++;
	}
	
	// Diminuire.
	public void abbassaVolume() {
//		volume--; // Così non va bene perchè decremento all'infinito.
		if(volume > 0) { // Uso if per soglia inferiore per non andare sotto zero.
			volume--;
		}
	}
	
	// play() riproduce l'audio stampandone il titolo e mostrando la durata tramite !.
	public void play() {
		for (int i = 0; i < durata; i++) {
			
            String audioOut = titoloElemento + " "; // Mi serve nel for.

            for (int j = 0; j < volume; j++) { 
                audioOut += "!"; // Aggiungo !.
            }

            System.out.println(audioOut);
        }
	}
}
