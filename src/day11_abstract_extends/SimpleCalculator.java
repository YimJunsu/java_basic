package day11_abstract_extends;

public class SimpleCalculator extends Calculator{
    public SimpleCalculator() {
        super(); // Calculator 기본 생성자
    }

    // 구현체 에서는 만든 추상메서드를 오버라이드 해서 인스턴스 메서드로
    @Override
    public int add(int num1, int num2) { // 메소드 재정의는 인스턴스 메서드만 가능
        return num1 + num2;
    }
}
