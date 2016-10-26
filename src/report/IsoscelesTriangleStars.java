package report;
import java.util.Scanner;
public class IsoscelesTriangleStars {
void iso(){
	Scanner s = new Scanner(System.in);
	System.out.print("이등변삼각각형 높이입력:");
	int num = s.nextInt();
	int i,j;
	for(i=0; i<num; i++)
	{
		for(j=num;j>i;j--)
			System.out.print(" ");
		for(j=i; j>=0; j--)
			System.out.print("*");
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println("");
	}
	System.out.println("");
}
}

