package codeup.sort;

import java.util.Scanner;

/**
 * [1441 : 버블 정렬] : https://codeup.kr/problem.php?id=1441
 *
 * - 문제 설명
 * 버블 정렬은 '인접한 두 원소를 검사하여 자리를 바꿔가며 정렬하는 방식'이다.
 * 이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.
 * 이 프로그램은 버블 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.
 * 빈 칸에 들어갈 코드만 작성해서 제출하시오.
 *
 * ► 정렬 방식에 대한 자세한 내용은 다른 블로그를 참고하기 바란다.
 *
 * - 입력
 * 빈 칸에 들어갈 코드를 작성한다.
 *
 * - 출력
 * 오름차순으로 정렬된 데이터가 출력된다.
 *
 * - 입력 예시
 * 5
 * 1
 * 3
 * 2
 * 5
 * 4
 *
 * - 출력 예시
 * 1
 * 2
 * 3
 * 4
 * 5
 *
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
	public static int[] bubbleSort(int[] numbers) {
		// 숫자 개수
		int size = numbers.length;
		// 임시 공간
		int temp;
		// 정렬
		for (int i = 0; i < size - 1; i++) {
			for (int j = 1; j < size - i; j++) {
				// 앞의 숫자가 더 크다면
				if (numbers[j - 1] > numbers[j]) {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		return numbers;
	}
}
