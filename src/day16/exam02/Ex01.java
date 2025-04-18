package day16.exam02;

import java.lang.reflect.Method;

// 리플렉션 예제,
// 릴플렉션? -> 프로그램 실행중 자기 자신구조(클래스, 메서드, 필드)를 들여다보고 조작할 수 있는
public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls = Class.forName("exam02.Person"); // 동적으로 클래스 자원이 데이터 영역으로 로드,
        // 반환값으로 클래스의 정보를 확인할 수 있는 Class 클래스 객체 반환
        for (Method method : cls.getMethods() ) {
            System.out.println(method);
        }
    }
}
