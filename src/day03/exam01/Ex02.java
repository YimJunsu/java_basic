package day03.exam01;

// 증감 연산자(전-후위)
public class Ex02 {
    public static void main(String[] args) {
        // 후위
        int a = 10;
        a++; // 1씩 증가
        System.out.println(a);
        a++; // 1씩 증가
        // a++; == a = a + 1;
        System.out.println(a);
        System.out.println("---------- Next");
        int b = 10;
        int c = b++;
        System.out.println(b); // 10
        System.out.println(c); // 11
        System.out.println("---------- Next");
        // 전위
        int d = 10;
        int e = ++d;
        System.out.println(e); // 11
        System.out.println(d); // 11
        System.out.println("---------- Next");
        // -- 연산자 (후)
        int f = 10;
        System.out.println("f1 = " + f); // 10
        f--;
        System.out.println("f2 = " + f); // 9
        ++f;
        --f; // 9
        System.out.println("f3 = " + f);
    }
        //val = num++; // val 변수에 기존 num 값을 먼저 대입한 후 값 1 증가
        //val = --num; // 먼저 num값이 1 감소한 후 val 변수에 대입
        //val = num--; // var 변수에 기존 num 값을 먼저 대입한 후 num값 1 감소
}
