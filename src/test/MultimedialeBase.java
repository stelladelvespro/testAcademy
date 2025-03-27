package test;

// Classe astratta da cui poi deriveranno immagini, audio e video
// Progetto: 
// 1) interfaccia Riproducibilità,
// 2) ordine: classe Immagine -> classe Audio -> Classe Video,
// 3) eventualmente parte facoltativa in classe Main.

public abstract class MultimedialeBase {
	
	protected String titoloElemento; 
	
	public MultimedialeBase(String titoloElemento) {
		this.titoloElemento = titoloElemento;
	}
	
	public String getTitoloElemento() { // getter per titoloElemento
		return titoloElemento;
	}
	

	
}
