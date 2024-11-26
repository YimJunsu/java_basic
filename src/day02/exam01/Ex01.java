package day02.exam01;

public class Ex01 {
    public static void main(String[] args) {
        byte num1 = 100; // 1byte = -128 ~ 127까지
        short num2 = 10000;
        int num3 = 10000000;

        char ch1 = 'A';
        System.out.println(ch1 + 1); // 아스키코드 65 = A

        char ch2 = '가';
        System.out.println(ch2 + 1); //sout 단축키

        System.out.println('A'<'B');
        System.out.println('가'<'나');
    }
}
