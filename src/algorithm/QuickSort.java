package algorithm;

import java.util.Queue;

public class QuickSort {

	int[] a = {2,6,5,1,4,3};

	private void quickSort(Integer[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private void quickSort(Integer[] data, int start, int end) {
		// 원소가 하나인 경우
		if (start >= end)
			return;

		// pivot
		int key = start;
		int i = start + 1;
		int j = end;
		int temp;

		// 시작이 끝과 작거나 같아지는 경우
		while (i <= j) {
			// 키 값보다 큰 값을 만날 때 까지
			while (data[i] <= data[key]) {
				i++;
			}
			// 키 값보다 작은 값을 만날 때 까지
			while (data[j] >= data[key] && j > start) {
				j--;
			}

			// 엇갈린 상태라면 키값과 교체
			if (i > j) {
				temp = data[key];
				data[key] = data[j];
				data[j] = temp;
			} else {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}

		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);
	}

	public static void main(String[] args) {
		Integer[] arr = {5,6,3,2,4,1};
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(arr);

		for (int i : arr) {
			System.out.println("i = " + i);
		}
	}
}
