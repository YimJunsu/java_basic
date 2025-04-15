package day12_interface.exam04;

public class Ex01 implements C{ // C 구현체는 A, B 인터페이스를 확장 받음,
    @Override
    public void methodC() {

    }

    @Override // 메서드 오버라이드 B
    public void methodB() {

    }

    @Override // 메서드 오버라이드 A
    public void methodA() {

    }

    public static void main(String[] args) {

    }

    @Override // 메서드 재정의
    public void method() {
        System.out.println("메서드!!");
    }
}
