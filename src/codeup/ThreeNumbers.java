package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String scan = scanner.nextLine();

        String[] numbers = scan.split(" ");

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(num);

        String result = "";
        for (int i : num) {
            result = result + i + " ";
        }

        System.out.println(result.trim());
    }
}
