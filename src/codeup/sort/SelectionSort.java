package codeup.sort;

import java.util.Scanner;

/**
 * [1442 : 선택 정렬] : https://codeup.kr/problem.php?id=1442
 *
 * - 문제 설명
 * 오름차순 선택 정렬은 '가장 작은 원소를 찾아 첫번째 위치로 옮기고, 남은 원소를 또 탐색하여 그 다음 작은 원소를 찾아 두번째 위치로 옮기고,
 * ... 이런식으로 정렬하는 방식'이다.
 * 이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.
 * 이 프로그램은 선택 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.
 * 빈 칸에 들어갈 코드만 작성해서 제출하시오.
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
