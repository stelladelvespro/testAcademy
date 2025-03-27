package test;

//La classe Video estende MultimedialeBase e ci interessa la 
//riproducibilità: viene implementata l'interfaccia Riproducibilità.

public class Video extends MultimedialeBase implements Riproducibilità {
	
	private int durata;
	private int volume;
	private int luminosità;
	
	public Video(String titoloElemento, int durata, int volume, int luminosità) {
		super(titoloElemento);
		this.durata = durata;
		this.volume = volume;
		this.luminosità = luminosità;
	}
	
	public void alzaVolume() {
		volume++;
	}
	
	public void abbassaVolume() {
		if(volume > 0) {
			volume--;
		}
	}
		
	public void aumentaLuminosità() {
		luminosità++;
	}
	
	public void diminuisciLuminosità() {
		if(luminosità > 0) {
			luminosità--;
		}
		
	}
	
	// play() riproduce il video stampando il titolo con ! e * .
	public void play() {
		
        for (int i = 0; i < durata; i++) { // Numero di volte pari alla durata.
        	
            String videoOut = titoloElemento + " "; // Mi serve nel for.

        for (int j = 0; j < volume; j++) { // Punti esclamativi in base al volume.
                videoOut += "!";
        }

        for (int k = 0; k < luminosità; k++) { // Asterischi in base alla luminosità.
                videoOut += "*";
        }

        System.out.println(videoOut); // Una stampa per ogni riga in base alla durata.
        
        }
    }
}
