package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MultimedialeBase[] elementi = new MultimedialeBase[5];
		
		System.out.println("5 ELEMENTI MULTIMEDIALI \nInfo: 1 è Immagine, 2 è Audio e 3 è Video.");
		
		// --------------------------------------------------------------------------------------------------------------------------
		// RICHIESTA E INSERIMENTO dei 5 elementi. Un for gigante.
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Inserire l'elemento multimediale numero " + (i + 1) + ":");
		
			int sceltaElemento = scanner.nextInt(); // Lettura dell'inserimento.
			scanner.nextLine(); 
			
			System.out.print("Titolo: ");
	        String titolo = scanner.nextLine(); 
			
			
			
			// Per ogni inserimento valuto i 3 possibili casi con switch.
			// caso 1 è Immagine, caso 2 è Audio e caso 3 è Video.
		
			switch (sceltaElemento) {
			
            case 1: 
            	
                System.out.print("Luminosità: "); // Inserire luminosità.
                int luminositàImmagine = scanner.nextInt();
                
                elementi[i] = new Immagine(titolo, luminositàImmagine);
                
                break;

            case 2: 
            	
                System.out.print("Durata: "); // Inserire durata.
                int durataAudio = scanner.nextInt();
                System.out.print("Volume: "); // Inserire volume.
                int volumeAudio = scanner.nextInt();
                
                elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                
                break;

            case 3: 
            
                System.out.print("Luminosità: "); // Inserire luminosità.
                int luminositàVideo = scanner.nextInt();
                System.out.print("Durata: "); // Inserire durata.
                int durataVideo = scanner.nextInt(); 
                System.out.print("Volume: "); // Inserire volume.
                int volumeVideo = scanner.nextInt();
                elementi[i] = new Video(titolo, luminositàVideo, durataVideo, volumeVideo);
                break;

            default:
                System.out.println("Puoi digitare solo 1, 2 o 3! Scelta non valida :( ");
                i--; // Faccio rifare l'inserimento?
        }
			
        scanner.nextLine(); 
    }

    System.out.println("L'inserimento è terminato. Grazie :)");
    
    //------------------------------------------------------------------------------------------------------------------------------
    
    // (tentativo...) CHIEDERE RIPETUTAMENTE ESECUZIONE
	
    int esecuzione = 1; // Inizializzo a un valore diverso da 0.
    
    while (esecuzione != 0) { // Ciclo while per ripetere finché non viene digitato 0 per uscire.
    	
        System.out.println("Ora scegli uno dei 5 elementi, digitando un numero tra 1 e 5, per continuare oppure 0 per uscire:");
        esecuzione = scanner.nextInt();

        if (esecuzione >= 1 && esecuzione <= 5) { // Controllo che sia stato digitato un numero tra 1 e 5.
            MultimedialeBase elemento = elementi[esecuzione - 1];

            if (elemento instanceof Immagine) { // Se è immagine chiama show().
                ((Immagine) elemento).show(); // cast per accedere a show().
            } else if (elemento instanceof Riproducibilità) { // Se è riproducibile (audio o video) chiama play().
                ((Riproducibilità) elemento).play(); // cast per accedere a play().
            }

        } else if (esecuzione == 0) { // Uscire.
            System.out.println("Ok, chiusura programma :(");
        } else {
            System.out.println("Scelta non valida.");
        }  
    }
    
    scanner.close(); 
		
	}
}