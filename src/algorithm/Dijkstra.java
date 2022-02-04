package algorithm;

public class Dijkstra {
    private static int number = 6;
    private static int INF = 1000000000;

    private static int[][] a = new int[][]{
            {0, 2, 5, 1, INF, INF},
            {2, 0, 3, 2, INF, INF},
            {5, 3, 0, 3, 1, 5},
            {1, 2, 3, 0, 1, INF},
            {INF, INF, 1, 1, 0, 2},
            {INF, INF, 5, INF, 2, 0}
    };

    private static boolean v[] = new boolean[6];
    private static int d[] = new int[6];

    public static void main(String[] args) {
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(0);

        for(int i = 0; i < number; i++) {
            System.out.print(d[i] + ", ");

        }
    }

    // 가장 최소 거리를 가지는 정점을 반환합니다
    private int getSmallIndex() {
        int min = INF;
        int index = 0;

        // 선형 탐색
        for (int i = 0; i < number; i++) {
            if (d[i] < min && !v[i]) {
                min = d[i];
                index = i;
            }
        }

        return index;
    }

    // 다익스트라를 수행하는 함수입니다.
    private void dijkstra(int start) {
        for (int i = 0; i < number; i++) {
            d[i] = a[start][i];
        }
        v[start] = true;

        for (int i = 0; i < number - 2; i++) {
            int current = getSmallIndex();
            v[current] = true;
            for (int j = 0; j < 6; j++) {
                if (!v[j]) {
                    if (d[current] + a[current][j] < d[j]) {
                        d[j] = d[current] + a[current][j];
                    }
                }
            }
        }
    }

}
