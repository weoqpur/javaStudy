package gsmClass;
import java.util.Scanner;

public class AnimalTest1 {

	public static void main(String[] args) {
		int i;
		int count[] = new int[4];
		Scanner sc = new Scanner(System.in);
		int ani = sc.nextInt();
		System.out.println("==<<"+ani+"회 반복 합니다>>==");
		
		for(i = 1; i <= ani; i++) {
			System.out.print(i+".");
			
			if(i % 3 == 0) {
				System.out.print(" cat");
				count[0]++;
			}
			if (i % 4 == 0) {
				System.out.print(" dog");
				count[1]++;
			}
			if (i % 5 == 0) {
				System.out.print(" lion");
				count[2]++;
			}
			if (i % 8 == 0) {
				System.out.print(" tiger");
				count[3]++;
			}
			System.out.println();
			
		}
		
		System.out.println("==<<Fruit Count List>>==");
		System.out.println("cat "+count[0]+"회");
		System.out.println("dog "+count[1]+"회");
		System.out.println("lion "+count[2]+"회");
		System.out.println("tiger "+count[3]+"회");
	}

}
