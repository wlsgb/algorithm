package programmers;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    public static void main(String[] args) {

        /**
         * 위장
         *
         * 문제 설명
         * 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
         *
         * 예를 들어 스파이가 가진 옷이 아래와 같고
         * 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면
         * 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
         *
         * clothes	return
         * {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}	5
         * {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}	3
         *
         */

        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(new Camouflage().solution(clothes));
    }

    /**
     *
     * @param clothes
     * @return
     */
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            answer *= e.getValue();
        }

        return answer - 1;
    }
}
