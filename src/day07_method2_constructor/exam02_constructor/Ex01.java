package day07_method2_constructor.exam02_constructor;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "임준수";
        s1.major = "수학";

        // Student 클래스 정의시 생성자 내용 기본 생성자로 적용
        Student s2 = new Student();
        s2.showInfo();
        // 매개변수 삽입, 기본 생성자 사용 X
        Student s3 = new Student(2000, "홍길동", "과학");
        s3.showInfo();

    }
}
