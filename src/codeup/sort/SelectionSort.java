package codeup.sort;

import java.util.Scanner;

/**
 * 1441 : 버블 정렬
 *
 * https://codeup.kr/problem.php?id=1441
 */
public class SelectionSort {

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
		numbers = SelectionSort.solution(numbers);

		// 출력
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
		
		scanner.close();
	}

	/**
	 * 선택 정렬
	 * @param numbers
	 * @return
	 */
	public static int[] solution(int[] numbers) {
		// 숫자 개수
		int size = numbers.length;

		int number;
		int temp;
		int save;
		int min;
		// 정렬
		for (int i = 0; i < size; i++) {
			min = numbers[i];
			save = i;
			for (int j = i + 1; j < size; j++) {
				number = numbers[j];
				// 기존 최소값 보다 작은 경우
				if (min > number) {
					min = number;
					save = j;
				}
			}

			if (i == save)
				continue;

			temp = numbers[i];
			numbers[i] = min;
			numbers[save] = temp;
		}

		return numbers;
	}
}
