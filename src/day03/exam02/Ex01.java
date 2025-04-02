package day03.exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num = 10;
        /*if (num == 10) {  // 조건식이 참일 때 실행
            System.out.println("10 입니다.");
        }else { // 조건식이 거짓일 때 실행
            System.out.println("10이 아닙니다");
        }*/
        String result = num == 10? "10 입니다." : "10이 아닙니다.";
        System.out.println(result);
        //간단한 조건문은 삼항 조건 연산식으로 교체 가능
        System.out.println("---------- Next");
        int age = 15;
        if (age < 8) {
            System.out.println("유치원생 입니다.");
        } else if (age < 14) { // age >= 8 && age < 14
            System.out.println("초등학생 입니다.");
        } else if (age < 17) { // age >= 14 && age < 17
            System.out.println("중학생 입니다.");
        } else if (age < 20) { // age >= 17 && age < 20
            System.out.println("고등학생 입니다.");
        } else { // 모두 거짓일 때 실행
            System.out.println("성인입니다.");
        }
    }
}
