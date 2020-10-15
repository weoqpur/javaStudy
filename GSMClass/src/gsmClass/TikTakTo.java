package gsmClass;

import java.util.Scanner;

public class TikTakTo {

	public static void main(String[] args) {
		int i, j, change = 1;
		Scanner sc = new Scanner(System.in);
		char arr[][] = { { 'O', 'O', 'O' }, { 'O', 'O', 'O' }, { 'O', 'O', 'O' } };
		while (true) {
			int y = sc.nextInt();
			int x = sc.nextInt();

			if (x > 4 && y > 4) {
				continue;
			}
			if (change == 1 && arr[y][x] == 'O') {
				arr[y][x] = 'x';
				change++;
			} 
			else if(change == 2 && arr[y][x] == 'O') {
				arr[y][x] = 'G';
				change--;
			}
			else {
				continue;
			}

			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.printf("%c ",arr[i][j]);
				}
				System.out.printf("\n");
			}
		}
	}

}
