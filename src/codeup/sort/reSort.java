package codeup.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reSort {
	/**
	 * [데이터 재정렬] : https://codeup.kr/problem.php?id=3004
	 *
	 * - 문제 설명
	 * 프로그래밍 문제를 풀다 보면 뒤죽박죽인 N개의 데이터를 숫자의 크기 순으로 0 ~ N-1까지의 숫자로 재정렬 해야되는 경우가 종종 있다.
	 * 예를 들어 N=5 이고,
	 * 50 23 54 24 123
	 * 이라는 데이터가 있다면,
	 * 2 0 3 1 4
	 * 가 된다.
	 * 데이터를 재정렬하는 프로그램을 작성하시오.
	 *
	 * - 입력
	 * 첫째 줄에 데이터의 개수 N이 입력된다. ( 1 <= N <= 50,000)
	 * 둘째 줄에 공백으로 분리되어 N개의 서로 다른 데이터가 입력된다. (값의 범위:0~500,000)
	 *
	 * - 출력
	 * N개의 데이터를 0 ~ N-1로 재정렬하여 출력하라.
	 *
	 * - 입력 예시
	 * 5
	 * 50 23 54 24 123
	 *
	 * - 출력 예시
	 * 2 0 3 1 4
	 *
	 * - 도움말
	 * 50 23 54 24 123 에서
	 * 23, 24, 50, 54, 123 순서로 0, 1, 2, 3, 4 가 된다.
	 * 그리고 원래의 위치대로 출력한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 데이터의 개수 입력
		int N = Integer.parseInt(sc.nextLine());

		// 입력 데이터
		Map<String, String> map = new HashMap<>();
		Integer[] sortArr = new Integer[N];

		// 공백으로 분리된 데이터 입력
		String[] tmp = sc.nextLine().split(" ");
		for (int i = 0; i < N; i++) {
			sortArr[i] = Integer.valueOf(tmp[i]);
			map.put(tmp[i], "");
		}

		// 정렬
		Arrays.sort(sortArr);

		// 재정렬
		for (int i = 0; i < N; i++) {
			map.put(String.valueOf(sortArr[i]), String.valueOf(i));
		}

		// 출력
		for (String i : tmp) {
			System.out.print(map.get(i) + " ");
		}
	}
}
