package day12_interface.exam05;

public class Outer {
    int num2 = 20;

    class Inner { //인스턴스 내부 클래스
        static int num1; // JDK 15 버전 까지는 오류, JDK16부터 가능 현재는 17

        int num2 = 10;

        public void method(){
            System.out.println("Inner 클래스에 정의된 메서드!");
            System.out.printf("num2=%d%n", num2);
            System.out.printf("Outer.num2=%d%n", Outer.this.num2);
        }
    }
}
