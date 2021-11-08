package programmers;

import java.util.HashMap;
import java.util.Map;

public class PlayersWhoDidNotComplete {

    public static void main(String[] args) {
        /**
         * [완주하지 못한 선수]
         *
         * 문제 설명
         * 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
         * 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
         *
         * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
         * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
         *
         * ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
         * ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
         * ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
         */

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};


        System.out.println(new PlayersWhoDidNotComplete().solution(participant, completion));
    }

    /**
     * 2021.09.12. jinH. 완주하지 못한 선수 복습
     *
     * @param participant 마라톤에 참여한 선수들의 이름이 담긴 배열
     * @param completion  완주한 선수들의 이름이 담긴 배열
     * @return 완주하지 못한 선수의 이름
     */
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();
        for (String e : participant) {
            hm.put(e, hm.getOrDefault(e, 0) + 1);
        }

        for (String e : completion) {
            hm.put(e, hm.get(e) - 1);
        }

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (e.getValue() != 0) {
                answer = e.getKey();
                break;
            }
        }

        return answer;
    }

    /**
     * 하나의 for문을 사용한 함수
     *
     * @param participant 마라톤에 참여한 선수들의 이름이 담긴 배열
     * @param completion  완주한 선수들의 이름이 담긴 배열
     * @return 완주하지 못한 선수의 이름
     */
    public String solution2(String[] participant, String[] completion) {
        HashMap map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.compute(participant[i], (k, v) -> v != null ? null : 1);
            if (i < completion.length)
                map.compute(completion[i], (k, v) -> v != null ? null : 1);
        }

        return (String) map.keySet().iterator().next();
    }
}




















