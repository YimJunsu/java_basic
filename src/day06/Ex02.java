package day06;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = add(num1, num2);
        System.out.println(result);
    }
    /**
     *  num1, num2, result -함수가 호출될 때만 공간을 할당, 의미가 있는 변수 (지역변수=로컬변수)
     * @param num1
     * @param num2
     * @return
     */
    static int add(int num1, int num2) {   // 함수 지역 / num1,num2 -> 함수가 실행될때만 할당 받는 지역변수
        int result = num1 + num2;
        return result; // 함수 연산 종료
    }
}
