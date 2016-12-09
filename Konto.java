
public interface Konto {

	public abstract float getKontostand();
	public abstract void einzahlen(float summe) throws IllegalArgumentException;
	public abstract void abheben(float summe) throws IllegalArgumentException;
	public abstract void ueberweisen(Konto b, float summe) throws
	 IllegalArgumentException;
}
