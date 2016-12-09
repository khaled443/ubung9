
public class MeinKonto implements Konto {

	float kontostand;
	final float ueberweisungslimit=500;
    final float minimalesLimit= -900;
    float abheben;
    float einzahlen;
     public MeinKonto(float kontostand) {

    	 this.kontostand=kontostand;
    	
	}
	@Override
	public float getKontostand() {

		
		return kontostand;
	}

	@Override
	public void einzahlen(float summe) throws IllegalArgumentException {
		
		if (summe<=0) {
			throw new IllegalArgumentException("Die summe darf nicht kleiner als 1 sein");
		}
		kontostand=kontostand+summe;
		
	}

	@Override
	public void abheben(float summe)  throws IllegalArgumentException{
		if (summe<=0) {
			throw new IllegalArgumentException("Die summe darf nicht kleiner als 1 sein");
			
		}else if ((kontostand-summe)<-900) {
			throw new IllegalArgumentException("Sie haben kein genug Geld");
			
		}else{
		kontostand=kontostand-summe;
		}
	}

	@Override
	public void ueberweisen(Konto b, float summe) throws IllegalArgumentException {

		if (summe<=0) {
			throw new IllegalArgumentException("Die summe darf nicht kleiner als 1 sein") ;
		}else if ((kontostand-summe)<-900) {
			throw new IllegalArgumentException("Sie haben kein genug Geld");
			
		}else{
			kontostand= kontostand-summe;
			b.einzahlen(summe);
		}
		
		
	}

	
}
