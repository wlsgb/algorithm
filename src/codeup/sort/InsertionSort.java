package codeup.sort;

import java.util.Scanner;

/**
 * 1443 : 삽입 정렬
 *
 * https://codeup.kr/problem.php?id=1443
 */
public class InsertionSort {

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
		numbers = InsertionSort.solution(numbers);

		// 출력
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}

		scanner.close();
	}

	/**
	 * 삽입 정렬
	 * @param numbers
	 * @return
	 */
	public static int[] solution(int[] numbers) {
		// 숫자 개수
		int size = numbers.length;

		int temp;
		// 정렬
		for (int i = 1; i < size; i++) {
			for (int j = i; j > 0; j--) {
				// 앞의 수가 더 큰 경우
				if (numbers[j - 1] <= numbers[j]){
					break;
				} else {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		return numbers;
	}
}
