
public class Testklass {
	public static void main(String[] args) {
		MeinKonto khaled = new MeinKonto(1000);
		MeinKonto jack = new MeinKonto(200);
		System.out.println(khaled.kontostand);
		
		khaled.einzahlen(100);
		System.out.println(khaled.kontostand);
		
		try {
			khaled.einzahlen(-100);
			System.out.println(khaled.kontostand);
		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());	
		}
		
		khaled.abheben(200);
		System.out.println(khaled.kontostand);
		
		
		try {
			khaled.abheben(4000);
			System.out.println(khaled.kontostand);
		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
		}

		khaled.ueberweisen(jack, 500);
		System.out.println("khaled neue Kontostand = " +khaled.getKontostand());
		System.out.println("jack neue Kontostand "+ jack.getKontostand());
		
		try {
			khaled.ueberweisen(jack, 4000);
			System.out.println(khaled.getKontostand());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());	
}
	}
	

}
