package day17_Enum.exam01;

// Enum 클래스 : 열거형으로, 상수(변하지 않는 수, 고정)들의 집합을 정의할 때 사용
public class Ex01 {
    public static void main(String[] args) {
        Transportation transportation = Transportation.BUS;
        System.out.println(transportation instanceof Transportation); // transportation이 Transportation 타입의 인스턴스인지 확인

        //transportation을 상위 타입인 Enum타입으로 참조
        Enum<Transportation> e = transportation;
    }
}
