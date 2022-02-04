package codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Top3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> students = new HashMap<>();

        String temp;
        for (int i = 0; i < size; i++) {
            temp = scanner.nextLine();
            String[] stu = temp.split(" ");
            students.put(stu[0], Integer.valueOf(stu[1]));
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(students.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println(list.get(2).getKey());
    }
}
