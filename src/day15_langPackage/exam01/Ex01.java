package day15_langPackage.exam01;

// Object 클래스 - 자바 모든 객체의 최상위 클래스, 모든 클래스는 Object 에 상속 받는다.
public class Ex01 {
    public static void main(String[] args) {
        // 다형성, 모든 클래스 Object 상속, 업캐스팅
        Object human = new Human();
        Object bird = new Bird();
        Object tiger = new Tiger();
        // f - 포맷 지정 출력
        // .hashCode() = Object 클래스의 메서드, 객체 고유 정수값 반환
        System.out.printf("human.hashCode():%d%n", human.hashCode());
    }
}
