package codeup.sort;

import java.util.Scanner;

/**
 * 1441 : 버블 정렬
 *
 * https://codeup.kr/problem.php?id=1441
 */
public class BubbleSort {

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

		numbers = SelectionSort.solution(numbers);
		
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
		
		scanner.close();
	}

	/**
	 * 버블 정렬
	 * @param numbers
	 * @return
	 */
	public static int[] solution(int[] numbers) {
		// 숫자 개수
		int size = numbers.length;

		int temp;
		// 정렬
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// 앞의 숫자가 더 크다면
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		return numbers;
	}
}
