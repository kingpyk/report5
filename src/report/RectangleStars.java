package report;
import java.util.Scanner;
public class RectangleStars {
	void rec(){
		Scanner s = new Scanner(System.in);
		System.out.print("정사각형 크기입력:");
		int num = s.nextInt();
		for(int i=0;i<5;i++){
			for(int j=0;j<num;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
 