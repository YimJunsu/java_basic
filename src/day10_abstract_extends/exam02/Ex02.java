package day10_abstract_extends.exam02;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C(); // C -> B 상속 -> A 상속

        A a = c; // 다형성
        B b = c; // 다형성, 하위 클래스의 객체는 상위 클래스의 자료형으로 자동 형변환
    }
}
