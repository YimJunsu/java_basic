package day12_interface.exam01;

public class ProCalculator implements Calculator{ // 인터페이스 는 implements
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
