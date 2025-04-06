package day04_Controlstatements;

// while 반복문    -  횟수가 정해진 반복문에서 필수 요소 ->  초기값, 조건식, 증감식 3개 필스
public class Ex02_while {
    public static void main(String[] args) {
//    int num = 1; // 증가하는 수
//    int total = 0; // 더해지는 합
        int num = 1, total = 0;  // 초기값, 초기화식;

        while (num <= 100) { //조건식
            total += num;          //= total = total + num;
            num++;               //= num = num + 1; 1씩 증가 // 증감식(증가 또는 감소)
        }
        System.out.println(total);
    }
}
