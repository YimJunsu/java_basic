package day06;

public class Ex01 {
    public static void main(String[] args) {
        // Student 이용 s1이라는 객체 생성
        Student s1 = new Student();
        // 대입
        s1.id = 1000;
        s1.name = "임준수";
        s1.major = "자바";
        // Student클래스 study 함수 실행
        s1.study();

        // 2
        int result = add(5); // x = 5
        System.out.println(result);
        }
        //int x = 매개변수
        static int add(int x){
            int y = x * 2 + 3;
            return y;
        }
}
