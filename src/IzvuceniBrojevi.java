
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IzvuceniBrojevi extends Start{
	
   private int size = 48;
   private int izvuceniBrojevi[]=new int [35];

  
   public void ispis() {
	   for(int i  = 0 ; i <this.izvuceniBrojevi.length;i++) {
		   System.out.println("Izvuceni broj " + i + " : " +this.izvuceniBrojevi[i]);

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
