package day11_abstract_extends;

public abstract class Calculator { // 추상 메서드가 정의된 클래스 - 추상클래스

    int num1 = 10; // 인스턴스 변수

    public Calculator(){
        System.out.println("Calculator 기본생성자");
    }
    public void method(){
        System.out.println("하위 클래스가 공유할 공통적인 메서드");
    }

    public abstract int add(int num1, int num2); // 추상메서드, 설계 도구
    /**
     * 추상클래스와 인터페이스 차이
     * 추상클래스 : 공통 기능을 가진 부모 클래스 (ex, "모든 동물은 숨을 쉰다" , "모든 탈것은 움직인다" 기본 동작 제공 - A는 B이다.
     * 공통 로직 공유 , 인스턴스 변수 가능
     * 인터페이스 : 특정 기능만 약속 (ex, "날 수 있다" , "그릴 수 있다" 등 기능만 정의 - A는 B 할 수 있다
     * 기능 명세 / 계약 , 상수만 가능
     */
}
