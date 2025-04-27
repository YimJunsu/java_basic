package day18_Annotation.exam01;

import java.lang.reflect.Method;
import java.util.Arrays;

// 리플렉션 예시
// 리플렉션 : 프로그램 실행 중에 클래스, 메서드, 필드, 애노테이션 등의 정보를 동적으로 분석하고 수정하는 기법
// Java 에서는 java.lang.reflect 패키지와 Class 클래스를 사용해서 리플렉션을 수행할 수 있다.
public class Ex02 {
    public static void main(String[] args) throws Exception {
        // Person.class를 통해 Class 객체 가져옴 (리플렉션의 시작)
        Class<Person> cls = Person.class;

        // 클래스에 붙은 @MyAnno 애노테이션 객체를 가져옴
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);

        // 애노테이션 객체 출력 (toString 형태)
        System.out.println(myAnno);

        // value 속성 꺼내서 출력 ("값1" 또는 설정한 값)
        String value = myAnno.value();
        System.out.println(value);

        // max 속성 값 출력
        int max = myAnno.max();

        // numbers 배열 값 꺼내서 출력
        int[] numbers1 = myAnno.numbers();
        System.out.println("max: " + max);
        System.out.println(Arrays.toString(numbers1));

        // =========================
        // 이번엔 메서드에 붙은 애노테이션 가져오기
        // =========================

        // "method"라는 이름의 메서드를 파라미터 타입 (String.class) 기준으로 찾음
        Method method = cls.getMethod("method", String.class);

        // 그 메서드에 붙은 @MyAnno 가져옴
        MyAnno myAnno2 = method.getAnnotation(MyAnno.class);

        // 메서드 애노테이션의 value 속성 출력 ("값3"일 가능성 있음)
        String value2 = myAnno2.value();
        System.out.println(value2);

        // max, numbers 도 마찬가지로 출력
        int max2 = myAnno2.max();
        int[] numbers2 = myAnno2.numbers();
        System.out.println("max2 : " + max2);
        System.out.println(Arrays.toString(numbers2));
    }
}

