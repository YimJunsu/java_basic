package day10_abstract_extends.exam02;

public class Ex04 {
    public static void main(String[] args) {
        C c = new C();
        A a = c;
        B b = c;

        // 주솟값 비교
        System.out.printf("a == b : %s%n", a == b); // a, b가 가지고 있는 주소가 같니?
        System.out.printf("b == c : %s%n", b == c); // b, c가 가지고 있는 주소가 같니?
    }
}
