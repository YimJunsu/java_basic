package day10_abstract_extends.exam01;

public class Ex03 {
    public static void main(String[] args) {
        /*Animal[] animals = new Animal[3];
        animals[0] = new Bird();
        animals[1] = new Human();
        animals[2] = new Tiger()*/;

        Animal[] animals = {new Bird(), new Human(), new Tiger()}; // 한줄로도 가능

        for (Animal animal : animals) {
            animal.move();
        }
    }
}
