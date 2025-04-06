package day06;

public class Student {
    int id; // 학번
    String name; // 학생명
    String major; // 전공명

    // 메서드 정의
    public void study(){
        System.out.printf("%s(%d)은 %s를 전공한다.%n", name, id, major);
        //%s = 문자열
        //%d = w정수
    }
}
