package day18_Annotation.exam01;

@MyAnno(max=10, numbers = {10, 20, 30, 40})// Person 클래스의 정의 일부
public class Person {

    // name이라는 필드에 삽입
    @MyAnno(value = "값2", max=15, numbers = {10, 20})
    private String name;

    // method라는 메서드에도 어노테이션 삽입
    @MyAnno(value = "값3")
    public void method(@MyAnno(value = "값4")String title){

    }
}