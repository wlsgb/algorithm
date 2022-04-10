package algorithm;

/**
 * DP : DynamicPrograming : 동정 계획법
 */
public class DynamicPrograming {

	private int[] list;

	public DynamicPrograming(int x) {
		this.list = new int[x];
	}

	/**
	 * 피보나치 수열 알고리즘
	 */
	private int fibonacci(int x) {
		if (x == 1) return 1;
		if (x == 2) return 2;
		if (list[x] != 0) return list[x];
		list[x] = fibonacci(x - 1) + fibonacci(x - 2);
		return list[x];
	}

	public static void main(String[] args) {
		int size = 30;
		DynamicPrograming dp = new DynamicPrograming(size + 1);
		int result = dp.fibonacci(size);
		System.out.println("result = " + result);
	}

}
