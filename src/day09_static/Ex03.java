package day09_static;

public class Ex03 {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);

        int result2 = add(20, 30);
        System.out.println(result2);

    }

    public static int add(int num1, int num2){
        int result = num1 + num2;

        return result;
    }
}
