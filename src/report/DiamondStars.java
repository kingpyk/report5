package report;
import java.util.Scanner;
public class DiamondStars {
void dia(){
	Scanner s = new Scanner(System.in);
	System.out.print("다이아몬드의 크기입력:");
	int num = s.nextInt();
	int i, j, k, l; 
	 for(i = 0; i < num; i++)  
	 { 
	 for(j = num-1; j > i; j--)  
	 System.out.print(" ");  
	 for(k = 0; k <= i; k++)  
	 System.out.print("*"); 
	 for(l = 0; l < i; l++)  
	 System.out.print("*"); 
	 System.out.println();  
	 } 
	  
	 for(i = 0; i < num-1; i++)  
	 { 
	 for(j = 0; j <= i; j++)  
	 System.out.print(" ");  
	 for(k = num-1; k > i; k--)  
	 System.out.print("*"); 
	 for(l = num-2; l > i; l--)  
	 System.out.print("*"); 
	 System.out.println();  
	 } 

}
}
