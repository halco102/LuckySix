import java.util.Scanner;

public class Upis_brojeva extends Start{

	private int [] uneseni_brojevi= new int[6];
	private int brojevi;
	Scanner unos = new Scanner(System.in);
	
	public void setBrojevi() {
		
		for(int i = 0 ; i < this.uneseni_brojevi.length; i++) {
			System.out.print("Broj : ");
			this.brojevi = unos.nextInt();
			this.uneseni_brojevi[i]=this.brojevi;
		}
		
	}
	
	public int [] getBrojevi() {
		return this.uneseni_brojevi;
	}
	
	protected boolean provjeraBrojeva(int niz[]) {
		
		for(int i = 0 ; i < niz.length; i ++) {
			for(int j = i+1 ; j <niz.length;j++ ) {
				if(niz[i]==niz[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
