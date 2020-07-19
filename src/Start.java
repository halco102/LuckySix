import java.util.ArrayList;

public class Start extends ProvjeraBrojeva  {
	private int novac=0,max=0;
	private int pozicijaLoptica[]=new int [6];
	private int [] pare = {10000,7500,5000,2500,1000,500,300,200,150,100,90,80,70,60,50,40,30,25,20,15,10,9,8,7,6,5,4,3,2,1};
	private int [][] matricaLoptica = new int [1][35];
	private int matricaPare[][]= new int [1][30];
	
	//start game
	//provjera brojeva
	
	private void popunjavanjeLoptica(int [] izbaceneLoptice) {
		for(int i = 0 ; i <this.matricaLoptica.length;i++ ) {
			for(int j = 0 ; j < this.matricaLoptica[i].length;j++) {
				this.matricaLoptica[i][j]=izbaceneLoptice[j];
			}
		}
	}
	
	private void popunjavanjePara() {
		
		for(int i = 0 ; i < this.matricaPare.length;i++) {
			for(int j = 0 ; j < this.matricaPare[i].length;j++) {
				this.matricaPare[i][j]=this.pare[j];
			}
		}
	}
	
	/*public boolean provjeraDobitka(int [] upisaniBrojevi){
		int temp=0;
		for(int i = 0 ; i < upisaniBrojevi.length;i ++) {
			for(int j = 0 ; j < this.matricaLoptica[0].length; j ++) {
				if(upisaniBrojevi[i]==this.matricaLoptica[0][j]) {
					temp++;
					System.out.println("TEST ISTI BR " + upisaniBrojevi[i] );
					if(temp<=5) {
						novcaniDobitak(this.matricaPare[0][j-5]);
						
						return true;
					}
				}
			}
		}
		
		
		return false;
	}*/
	public void provjeraDobitka(int [] upisaniBrojevi){
		int temp=0;
		int min=0;
		boolean pobjeda=false;
		
		for(int i = 0 ; i < upisaniBrojevi.length;i ++) {
			for(int j = 0; j < this.matricaLoptica[0].length; j ++) {
				if(upisaniBrojevi[i]==this.matricaLoptica[0][j]) {
					temp+=1;

					System.out.println("Istih ima " + temp);
					if(temp==6) {
						min=j;
						this.pozicijaLoptica[temp-1]=min;
						pobjeda=true;
					}
			}
		}
	}//for petlja		
		if(pobjeda==true) {
			System.out.println("Pobijedili ste ");
			novcaniDobitak(nadjiLopticu());
			novcaniDobitak();
			
		}else {
			System.out.println("Izgubili ste");
		}
		System.out.println("Zadnji izvuceni broj je " + nadjiLopticu() + " a taj broj je " + this.matricaLoptica[0][nadjiLopticu()]);
		
	}
	
	
	private int nadjiLopticu() {
		this.max=this.pozicijaLoptica[0];
		for(int i = 0 ; i < this.pozicijaLoptica.length;i++) {
			if(this.max<this.pozicijaLoptica[i]) {
				this.max=this.pozicijaLoptica[i];
			}
		}
		return this.max;
	}
	
	private int novcaniDobitak(int Broj) {
		this.novac=this.pare[Broj-5];
		return this.novac;
	}
	
	private int getNovac() {
		return this.novac;
	}
	
	public void novcaniDobitak() {
		System.out.println("Osvojili ste : " + getNovac() + " KM" );
	}

	public void dobitak( int[] izbaceneLoptice) throws InterruptedException {

				popunjavanjeLoptica(izbaceneLoptice);
				popunjavanjePara();

				
				for(int i = 0 ; i < 5 ; i ++ ) {
					System.out.println(this.matricaLoptica[0][i]);
					//Thread.sleep(1000);
				}
				for(int j = 0 ; j < 30 ; j ++ ) {
					System.out.print(this.matricaPare[0][j] + " KM : " + this.matricaLoptica[0][j+5] + "\n");
					//Thread.sleep(1000);
				}
			}
		
		

	
	
	}

	
	
	
	

