package report;
import java.util.Scanner;
public class TriangleStars {
void tri(){
	Scanner s = new Scanner(System.in);
	int num1,num2;
	System.out.print("직각삼각형 왼쪽공백과 높이 입력:");
	String[] input = s.nextLine().split(" "); 
	num1 = Integer.parseInt(input[0]); 
	num2 = Integer.parseInt(input[1]);
	 for(int i = 0; i <=num2;i++){ 
		 for(int j = 1; j <= num1-i; j++){ 
		 System.out.print(" "); 
		 } 
		 for(int j = 1; j <= i; j++){ 
		 System.out.print("*"); 
		 } 
		 System.out.println(); 
		 } 
		 } 
		 } 
