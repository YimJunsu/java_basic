package day18_Annotation.exam01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

// 사용자 정의 어노테이션 만들기
// 1) 어디에 사용할 수 있는지 지정
// TYPE -> 클래스나 인터페이스, FIELD -> 멤버 변수(필드)에, METHOD -> 메소드에, PARAMETER -> 매개변수에
@Target({TYPE, FIELD, METHOD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 유지 범위 설정 - RUNTIME 실행 될 때 까지(리플렉션을 통해 어노테이션 정보 읽기 가능, 실행시)
public @interface MyAnno {
    String value() default "값1"; // 기본 설정 value();
    int max() default 100;
    int[] numbers() default {10, 20};

}
