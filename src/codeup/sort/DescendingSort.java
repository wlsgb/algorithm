package codeup.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingSort {
	public static void main(String[] args) {

		/**
		 *  첫줄에는 데이터의 개수를 입력받는다.(100이하의 정수)
		 *
		 * 다음 줄에는 데이터가 입력된다.(100이하의 정수)
		 */

		Scanner sc = new Scanner(System.in);
		// 100 보다 큰 경우 실패
		Integer num = Integer.valueOf(sc.nextLine());
		// 데이터의 개수 입력
		if (num > 100) {
			return;
		}

		// 데이터 입력
		String[] tmp = sc.nextLine().split(" ");

		// 정렬할 대상
		Integer[] arr = new Integer[num];

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.valueOf(tmp[i]);
		}

		Arrays.sort(arr, Collections.reverseOrder());

		String result = "";
		for (int i : arr) {
			result = result + i + " ";
		}

		System.out.println(result);
	}
}
