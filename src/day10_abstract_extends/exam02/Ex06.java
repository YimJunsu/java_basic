package day10_abstract_extends.exam02;

public class Ex06 {
    public static void main(String[] args) {
        C c = new C(); // C, B, A
        System.out.println("c instanceof C : " + (c instanceof C)); // true
        System.out.println("c instanceof B : " + (c instanceof B)); // true
        System.out.println("c instanceof A : " + (c instanceof A)); // true

        A ad = new D();
        System.out.println("ad instanceof C : " + (ad instanceof C));// false
    }
}
