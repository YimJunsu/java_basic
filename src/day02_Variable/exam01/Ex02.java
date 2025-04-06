package day02_Variable.exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;

        num1 = 20; // 변수는 값 변경 가능
        final int num2 = 30; // 상수 - 변경 불가, 이름 대문자로
        //num2 = 40;
        final int NUM_OF_STUDENT = 30 ;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(NUM_OF_STUDENT);

        int num3 = 10; //10은 재료가 되는 수 : 리터럴 상수
        int num4 = 10;
        char ch1 = 'A'; // 리터럴 상수
        char ch2 = 'A'; //ch1 ch2 동일한 재료를 참조
        System.out.println(num3==num4); // ==자원의 위치(주소)에 대한 비교
        System.out.println(ch1==ch2);
    }
}
