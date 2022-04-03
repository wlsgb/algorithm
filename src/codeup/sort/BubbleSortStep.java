package codeup.sort;

import java.util.Scanner;

/**
 * [3011 : 거품 정렬(Bubble Sort)] https://codeup.kr/problem.php?id=3011
 *
 * - 문제 설명
 * 버블 정렬이란 이웃하는 숫자들끼리 크기를 비교하여 자리를 바꾸는 정렬 기법이다.
 * 버블 정렬은 구현이 쉬운 반면 속도가 빠른 편은 아니다.
 * 그리고 가장 큰 단점으로 정렬이 이미 다 끝났는데도, 끝까지 대소비교를 하는 문제점이 있다.
 * 예를 들어, 10 50 30 20 40 이 있고 오름차순으로 정렬한다면 총 4단계를 거치게되는데,
 * 1단계 : 10 30 20 40 50
 * 2단계 : 10 20 30 40 50  (정렬 완료)
 * 3단계 : 10 20 30 40 50
 * 4단계 : 10 20 30 40 50
 * 4단계중 이미 2단계에서 정렬이 완료가 된다.
 * 이 단계를 구하는것이 문제이다. 이 단계를 찾아 프로그램을 종료시키면 정렬속도를 향상 시킬수있다.
 * 이 단계를 찾아 내는 프로그램을 작성하시오.
 *
 * 입력
 * 첫 줄에 데이터의 개수 n이 입력된다. (2 <= n <= 1,000)
 * 둘째 줄에 n개의 데이터가 공백을 기준으로 입력된다.
 *
 * 출력
 * 정렬이 끝나는 단계를 출력한다.
 *
 * 입력 예시
 * 5
 * 10 50 30 20 40
 *
 * 출력 예시
 * 2
 */
public class BubbleSortStep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 데이터의 개수 입력
		int N = Integer.parseInt(sc.nextLine());

		// 입력 데이터
		Integer[] numArr = new Integer[N];

		// 공백으로 분리된 데이터 입력
		String[] tmp = sc.nextLine().split(" ");
		for (int i = 0; i < N; i++) {
			numArr[i] = Integer.valueOf(tmp[i]);
		}

		// 버블 정렬
		int result = new BubbleSortStep().bubbleSort(numArr);

		System.out.println(result);

		sc.close();
	}

	/**
	 * 버블 정렬
	 * @param numArr 숫자 배열
	 */
	public int bubbleSort(Integer[] numArr) {
		// 데이터 사이즈
		int size = numArr.length;
		// 정렬 완료 여부
		boolean sortComplete;
		// 정렬 완료 단계
		int step = 1;
		// 임시 공간
		int temp;
		// 버블 정렬 처리
		for (int i = 0; i < size - 1; i++) {
			sortComplete = true;
			for (int j = 1; j < size - i; j++) {
				// 타겟 숫자가 더 큰 경우
				if (numArr[j - 1] > numArr[j]) {
					sortComplete = false;
					temp = numArr[j];
					numArr[j] = numArr[j - 1];
					numArr[j - 1] = temp;
				}
			}
			// 정렬을 수행한 경우
			if (!sortComplete) {
				step = i + 1;
			}
		}

		return step;
	}
}
