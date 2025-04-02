package day04.exam01;

//변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해보시오.
public class Example1 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.0;
        int result = (int)(num1 + num2);
        int result1 = (int)(num1 - num2);
        int result2 = (int)(num1 * num2);
        int result3 = (int)(num1 / num2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
