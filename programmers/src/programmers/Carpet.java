package programmers;

public class Carpet {

    public static void main(String[] args) {

        /**
         *
         * 카펫
         *
         * 문제 설명
         * Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고
         * 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
         *
         * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
         *
         * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로,
         * 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
         *
         * 제한사항
         * 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
         * 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
         * 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
         *
         * 입출력 예
         * brown	yellow	return
         * 10	    2	    [4, 3]  12
         * # # # #
         * # @ @ #
         * # # # #
         *
         * 8	    1	    [3, 3]  9
         * # # #
         * # @ #
         * # # #
         *
         * 24	    24	    [8, 6]  48
         * # # # # # # # #
         * # @ @ @ @ @ @ #
         * # @ @ @ @ @ @ #
         * # @ @ @ @ @ @ #
         * # @ @ @ @ @ @ #
         * # @ @ @ @ @ @ #
         * # # # # # # # #
         *
         * 30       42      [9, 8]  72
         * # # # # # # # # #
         * # @ @ @ @ @ @ @ #
         * # @ @ @ @ @ @ @ #
         * # @ @ @ @ @ @ @ #
         * # @ @ @ @ @ @ @ #
         * # @ @ @ @ @ @ @ #
         * # @ @ @ @ @ @ @ #
         * # # # # # # # # #
         *
         *
         * x * y = total;
         */

        int brown = 30;
        int yellow = 42;

        int[] result = new Carpet().solution2(brown, yellow);

        System.out.println(result[0] + " : " + result[1]);

    }

    /**
     * 카펫
     *
     * @param brown  갈색 격자의 수
     * @param yellow 노란색 격자의 수
     * @return
     */
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        /**
         * 가로길이(x)가 세로길이(y)와 같거나 크다
         * x * y = total;
         */
        int index = 0;
        for (int x = 3; x < brown / 2; x++) {
            for (int y = x; y >= 3; y--) {
                if (total == x * y && (x - 2) * (y - 2) == yellow) {
                    answer[0] = x;
                    answer[1] = y;
                    return answer;
                }
            }
        }

        return answer;
    }

    /**
     * @param brown
     * @param yellow
     * @return
     */
    public int[] solution2(int brown, int yellow) {

        for (int i = 1; i <= yellow; i++) {
            int a = yellow % i;
            int b = (yellow / i + i) * 2 + 4;
            if (yellow % i == 0 && (yellow / i + i) * 2 + 4 == brown) {
                return new int[]{yellow / i + 2, i + 2};
            }
        }
        return null;
    }


}






















