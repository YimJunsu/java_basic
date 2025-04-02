package day04.exam01;

// for 문
public class Ex04_for {
    public static void main(String[] args) {
        // 1
        int total1 = 0;
        for (int num = 1; num <= 100; num++) {
            total1 += num;

            if (num == 50) {
                break;
            }
        }
        System.out.println("for문1 = " + total1);
        // 2
        int total2 = 0;
        for (int i = 1, j = 100; i <= 100; i++, j--) {
            total2 += i;
            System.out.println("for문2j=" + j);
        }
        System.out.println("for문2 = " + total2); // 5050
        // 3
        int total3 = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) { //짝수 일 때 건너띄기
                continue;
            }
            total3 += i;
            /*if( i % 2 == 1) { // 홀수 일 때 더하기
                total3 += i;
            }*/
        }
        System.out.println("for문3 = " + total3); // 2500
    }
}
