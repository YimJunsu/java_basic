package day02_Variable.exam01;

public class Ex03 {
    public static void main(String[] args) {
//        long num2 = 1_000_000_000_000; // int -> long
        long num1 = 100_000_000_000L; //L -> 처음부터 long 인식하게

        byte num3 = 100; // int로 처음 인식하고 byte
        short num4 = 1000; // 특별한 일 없으면 int로 시작
        double num5 = 10.1234;

        float num2 = 10.1234F; // 처음부터 float(4byte)로 인식

        // 가장 효율적인 실수 자료형 - double
    }
}
