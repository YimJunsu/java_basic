package day07_method2.exam02_생성자;

public class Ex02 {
    public static void main(String[] args) {
        int result1 = add(10, 20); // int add(int, int)
        System.out.println("result1=" + result1);
        int result2 = add(10, 20, 30); // int add(int, int, int)
        System.out.println("result2=" + result2);
        double result3 = add(10.123, 20); // double add(double, int)
        System.out.println("result3=" + result3);
    }

    static int add(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }

    static int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;

        return result;
    }

    static double add(double num1, int num2) {
        double result = num1 + num2;
        return result;
    }
}
// 메서드 오버로드: 동일한 함수 이름으로 매개변수 정의와 반환값을 달리 여러개 정의하는 방법.
