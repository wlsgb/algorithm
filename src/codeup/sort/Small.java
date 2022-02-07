package codeup.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1451 : 데이터 정렬 (small)
 *
 * https://codeup.kr/problem.php?id=1451
 */
public class Small {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 입력할 횟수 입력
		int size = Integer.parseInt(scanner.nextLine());
		// 입력할 공간
		int[] numbers = new int[size];
		// 정렬할 숫자 입력
		for (int i = 0; i < size; i++) {
			numbers[i] = Integer.parseInt(scanner.nextLine());
		}

		// 결과 값
		Arrays.sort(numbers);

		// 출력
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}

		scanner.close();
	}
}
