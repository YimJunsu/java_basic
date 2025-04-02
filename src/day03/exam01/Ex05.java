package day03.exam01;

// 삼항 조건 연산자 , != => 부정
public class Ex05 {
    public static void main(String[] args) {
        int num = 10;

        String result = num == 10? "10입니다." : "10이 아닙니다.";
//                          1항         2항           3항
        System.out.println(result);
        System.out.println("---------- Next");
        boolean a = true;
        System.out.println(a);

        boolean b = !true; // !로 true -> false
        System.out.println(b);

        boolean c = !b; // !로 false -> ture
        System.out.println("c="+c);
    }
}
