package codeup.sort;

import java.util.Scanner;

/**
 * [1443 : 삽입 정렬] : https://codeup.kr/problem.php?id=1443
 *
 * - 문제 설명
 * 오름차순 삽입 정렬은 '정렬된 데이터 셋에 뒤쪽에서 부터 원소를 하나씩 삽입하여 순서에 맞는 위치로 찾아가며 정렬하는 방식'이다.
 * 이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.
 * 이 프로그램은 선택 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.
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
		numbers = InsertionSort.insertionSort(numbers);

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
	public static int[] insertionSort(int[] numbers) {
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
