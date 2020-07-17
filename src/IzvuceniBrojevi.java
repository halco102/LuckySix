import java.text.Format;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IzvuceniBrojevi extends Start{
	
   private int size = 48;
   private int izvuceniBrojevi[]=new int [30];

  
   public void ispis() {
	   /*for(int i  = 0 ; i <this.izvuceniBrojevi.length;i++) {
		   System.out.println("Izvuceni broj " + i + " : " +this.izvuceniBrojevi[i]);
	   }*/
	   int temp = 0;
	   int matrica[][] = new int [2][9];
	   int drugaMatrica[][]= new int [4][3];
	   
	   for(int i = 0 ; i < 2 ; i ++ ) {
		   if(i == 0 ) {
			   for(int j = 0 ; j < 9 ; j ++) {
				   matrica[i][j]=this.izvuceniBrojevi[j];
				   System.out.println(matrica[i][j]+"\t");
			   }
		   }else {
			   for(int k = 21 ; k < 30 ; k ++) {
				   matrica[i][k-21]=this.izvuceniBrojevi[k];

				   System.out.println(matrica[i][k-21]+"\t");
			   }
		   }
		   
	   }
	   
	 
   }
   
   IzvuceniBrojevi(){
	   super();
   }
   
   private int[] izvuceniBr() { // kreira sve random brojeve 
	   Random rand = new Random();		   
		   while(provjera()==false) {
			   for(int i = 0 ; i < izvuceniBrojevi.length;i ++) {
				   izvuceniBrojevi[i]=rand.nextInt(size)+1;
			   		}   
		   }
	   return izvuceniBrojevi;
		   
   	}
   
   public void setBrojevi() {
	   izvuceniBr();
   }
   
   public int[] getBrojevi() {
	   return this.izvuceniBrojevi;
   }
   
   private boolean provjera() {
	   for(int i = 0 ; i < izvuceniBrojevi.length;i++) {
		   for(int j = i+1 ; j<izvuceniBrojevi.length;j++) {
			   if(this.izvuceniBrojevi[i]==this.izvuceniBrojevi[j]) {
				   return false;
			   }
		   }
	   }

	   return true;
   }
   
   
   
   
   
}
