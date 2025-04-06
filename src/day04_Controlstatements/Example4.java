package day04_Controlstatements;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {// 단
            if (i % 2 == 0) {
                continue; // 짝수 건너띄기, 홀수만 출력
            }
            System.out.printf("---%d단---%n", i);
            for (int j = 1; j <= 9; j++) { // 곱하는 수
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
    }
}
