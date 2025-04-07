package day08_constructor_access.exam04access;

import day08_constructor_access.exam03access.A;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        // a.num1= 10; default 접근 제어자, 동일 패키지가 아니므로 접근 분가
    }
}
