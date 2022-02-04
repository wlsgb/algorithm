package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class jakard {
    public static void main(String[] args) {

        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";
        System.out.println(new jakard().solution(str1, str2));

    }

    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase(Locale.ROOT);
        str2 = str2.toUpperCase(Locale.ROOT);

        double max = 0;
        double min = 0;
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();

        String regex = "^[A-Z]$";

        for (int i = 0; i < str1.length() - 1; i++) {
            if (vali(str1.charAt(i)) && vali(str1.charAt(i+1)))
                A.add(str1.substring(i, i+2));
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (vali(str2.charAt(i)) && vali(str2.charAt(i+1)))
                B.add(str2.substring(i, i+2));
        }



        return answer;
    }

    public boolean vali(char c) {
        return 'A' <= c && 'Z' >= c;
    }
}
