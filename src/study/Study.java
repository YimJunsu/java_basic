package study;

class Parent{
    public Parent(){
        System.out.print("A");
    }
    public void fn(){
        System.out.print("B");
    }
    public void fnA(){
        System.out.print("C");
    }
}
class Child extends Parent{
    public Child(){
        System.out.print("D");
    }
    public void fn(){
        System.out.print("E");
    }
    public void fnB(){
        System.out.print("F");
    }
}

public class Study {
    public static void main(String[] args) {
        Child child = new Child();
        child.fn();
        child.fnA();
    }
}

