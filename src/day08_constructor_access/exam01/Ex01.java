package day08_constructor_access.exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        // CreaditCatd 라는 객체 생성 후, 매개변수 대입
        CreditCard card1 = new CreditCard(1000, "임준수", "2028-01-01");
        card1.showInfo();

        Class cls = CreditCard.class; // 클래스의 구성 정보가 담겨있는 객체

        // 생성자 구성 정보
        Constructor[] constructors = cls.getConstructors();

        for(Constructor constructor : constructors) {
            System.out.println(constructor); //public exam01.CreditCard(int,java.lang.String,java.lang.String)
        }

        // 메서드 구성 정보
        Method[] methods= cls.getDeclaredMethods();
        for (Method method : methods){     //void exam01.CreditCard.showInfo()
            System.out.println(method);
        }
    }
}
