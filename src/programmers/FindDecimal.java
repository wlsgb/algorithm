package programmers;

import java.util.ArrayList;
import java.util.List;

public class FindDecimal {

    public static void main(String[] args) {

        /**
         * 소수 찾기
         *
         * 문제 설명
         * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
         *
         * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때,
         * 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
         *
         * 제한사항
         * numbers는 길이 1 이상 7 이하인 문자열입니다.
         * numbers는 0~9까지 숫자만으로 이루어져 있습니다.
         * "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
         *
         * numbers	return
         * "17"	    3
         * "011"	2
         * "1234567"
         * 01..07
         */

        String numbers = "17";

        System.out.println(new FindDecimal().solution(numbers));
    }

    boolean[] visited;
    ArrayList<Integer> all_card;


    /**
     * 소수 찾기
     *
     * @param numbers 각 종이 조각에 적힌 숫자가 적힌 문자열
     * @return 종이 조각으로 만들 수 있는 소수가 몇 개
     */
    public int solution(String numbers) {
        int answer = 0;
        int n = numbers.length();
        String[] card = new String[n];
        visited = new boolean[n + 1];
        all_card = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            card[i] = Character.toString(numbers.charAt(i));
        }

        for (int r = 0; r < n; r++) {
            permutation(card, "",r + 1, 0);
        }

        answer = all_card.size();

        return answer;
    }

    /**
     * 번호 생성
     * @param card
     * @param str
     * @param r
     * @param depth
     */
    private void permutation(String[] card, String str, int r, int depth) {
        if (depth == r) {
            int tmp = Integer.parseInt(str);
            // 소수이고 기존에 존재하지 않을 경우
            if (check(tmp) && !all_card.contains(tmp)) {
                all_card.add(tmp);
            }
            return;
        }

        for (int i = 0; i < card.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                str = str + card[i];
                permutation(card, str, r, depth + 1);
                // 방문하지 않는 경우 붙여준 카드 숫자를 다시 빼줘야함
                str = str.substring(0, str.length() - 1);
                visited[i] = false;
            }
        }
    }

    /**
     * 소수 체크
     * @param num
     * @return
     */
    private boolean check(int num) {
        if (num == 0 || num == 1) return false;

        if (num == 2 || num == 3) return true;

        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public int solution2(String numbers) {
        int answer = 0;

        ArrayList<String> numberList = new ArrayList<>();
        int[] numberArr = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            numberArr[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        permutation2(numberArr, 0, numberArr.length, numberList);

        int number;
        int cnt;
        for (String e : numberList) {
            number = Integer.parseInt(e);
            cnt = 1;
            xx:
            for (int i = 2; i <= number; i++) {

                if (number % i == 0) {
                    cnt++;
                }
                if (cnt > 2)
                    break xx;
            }

            if (cnt == 2)
                answer++;
        }

        return answer;
    }

    private void permutation2(int[] numbers, int start, int end, List<String> list) {
        int temp = 0;

        if (start == end) {
            StringBuilder num = new StringBuilder();
            for (int i : numbers) {
                num.append(i);
            }
            list.add(num.toString());
        } else {
            for (int i = start; i < end; i++) {
                temp = numbers[start];
                numbers[start] = numbers[i];
                numbers[i] = temp;

                permutation2(numbers, start + 1, end, list);

                temp = numbers[start];
                numbers[start] = numbers[i];
                numbers[i] = temp;
            }
        }
    }
}



















