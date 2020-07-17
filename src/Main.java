import java.util.Scanner;

public class Main {

	public static void dash() {
		System.out.println("|----------------------------------------------|");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Upis_brojeva Upis = new Upis_brojeva();
		IzvuceniBrojevi IzvuceniBrojevi = new IzvuceniBrojevi();
		System.out.println("Unesite svoje brojeve :");
		
		
		do {
			Upis.setBrojevi();
			if(Upis.provjeraBrojeva(Upis.getBrojevi())==true) {
				System.out.println("Imate duplikat, upisite ponovo brojeve !");
				dash();
			}
		}while(Upis.provjeraBrojeva(Upis.getBrojevi())==true);
		dash();
		//ispis izbacenih kuglica
		IzvuceniBrojevi.setBrojevi();
		IzvuceniBrojevi.ispis();
		dash();
	
		//end
		
		
		
	}

}
