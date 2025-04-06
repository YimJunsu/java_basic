package day02_Variable.exam02;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 100000; //4바이트
        byte num2 = (byte)num1; // 명시적 형변환 - 강제 형변환
        System.out.println(num2);
    }
}
