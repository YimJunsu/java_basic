package day03.exam01;

// 논리 연산자 (boolean)
public class Ex03 {
    public static void main(String[] args) {
        boolean result1 = 10 > 5;
        System.out.println(result1); // t

        int num1 = 70;
        boolean result2 = num1 >= 10;
        boolean result3 = num1 <= 100;
        // -> 합치면 10 <= num1 <= 100
        boolean result4 = result2 && result3; // result1, result2가 모두 참일때 참
        System.out.println(result4); // t
        System.out.println("---------- Next");
        boolean result5 = num1 >= 10 && num1 <=100;
        // System.out.println(result5);
        boolean result6 = num1 >= 10 || num1 <=100; // 둘 중 하나만 참이여도 참
        System.out.println(result6); // t
        System.out.println("---------- Next");
        int num2= 10;
        boolean falseresult = num2++ > 10 && (num2 = num2 + 20) >= 20; // num = 11
        //   ++ 위치에 따라 값이 달라짐, &&-> 왼쪽항이 false 면 오른쪽항 체크X
        System.out.println(falseresult); // false
        System.out.println(num2); // 11

        // num 2 = 11
        boolean orresult = ++num2 > 10 || (num2 = num2 + 20) >= 20;
        // ||(or) 앞에 있는 항 true 면 뒷항 패스
        System.out.println(orresult); //true
        System.out.println(num2); // 12
    }
}
