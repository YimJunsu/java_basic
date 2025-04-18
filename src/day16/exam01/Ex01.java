package day16.exam01;

// Wrapper 클래스 및 형 변환 예제
public class Ex01 {
    public static void main(String[] args) {

        // 사용 자제된 방식 (Java 9부터 deprecated)
        Integer num1 = new Integer(10); // 비권장: deprecated
        long num2 = num1.longValue();
        System.out.println("num1 (new Integer): " + num2);

        // 권장 방식 1: valueOf() 메서드 사용
        Integer num3 = Integer.valueOf(10);
        long num3_1 = num3.longValue();
        System.out.println("num3 (valueOf): " + num3_1);

        // 권장 방식 2: auto-boxing 사용
        Integer num4 = 10;
        long num4_1 = num4.longValue();
        System.out.println("num4 (auto-boxing): " + num4_1);
    }
}
