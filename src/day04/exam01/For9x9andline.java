package day04.exam01;

public class For9x9andline {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            // System.out.println("--- " + i + " ---"); // 단수 구분 문구
            System.out.printf("--- %d단 ---%n", i);
            for (int j = 1; j <= 9; j++) {
                //System.out.println(i + "X" + j + "=" + ( i * j));
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
        System.out.print("ABC"); // 줄개행 X
        System.out.print("DEF"); // 줄개행 X

        for (int j = 1; j <=10; j++) {
            System.out.println();
        }
        System.out.println("GHI");
    }
}
