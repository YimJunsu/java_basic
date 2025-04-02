package day03.exam01;

// 나머지 연산자
public class Ex01 {
    public static void main(String[] args) {
        // 규칙성 : 균등 배분시 활용(나누는 수보다 작은수가 반복된다.)
        System.out.println(1 % 3); //1 - 1을 3으로 나눈 나머지
        System.out.println(2 % 3); //2
        System.out.println(3 % 3); //3
        System.out.println(4 % 3);
        System.out.println(5 % 3);
        System.out.println(6 % 3);
        // [ i % 2 == 0 => 짝수 ], [ i % 2 == 1 => 홀수 ]
        System.out.println(1 % 2); //1 - 홀수
        System.out.println(2 % 2); //짝수 - 0
        System.out.println(3 % 2); //1 - 홀수
        System.out.println(4 % 2); //짝수 - 0
        System.out.println(5 % 2); //1 - 홀수
        System.out.println(6 % 2);
    }

}
