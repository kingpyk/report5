package report;
import java.util.Scanner;
public class ExamforWhileStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("************");
		System.out.println("1. 정사각형 별찍기");
		System.out.println("2. 직각삼각 별찍기");
		System.out.println("3. 이등변삼각형 별찍기");
		System.out.println("4. 다이아몬드 별찍기");
		System.out.println("5. 종료하기");
		System.out.print("원하는 메뉴는>>");
		int menu = s.nextInt();
		switch(menu){
		case 1:
			new RectangleStars().rec();
			break;
		case 2:
			new TriangleStars().tri();
			break;
		case 3:
			new IsoscelesTriangleStars().iso();
			break;
		case 4:
			new DiamondStars().dia();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}

}
