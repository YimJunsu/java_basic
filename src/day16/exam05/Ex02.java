package day16.exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make2(appleBox);

        FruitBox<Fruit> grapdBox = new FruitBox<>();
        grapdBox.add(new Grape());
        grapdBox.add(new Grape());
        grapdBox.add(new Grape());

        Juicer.make2(grapdBox); // Apple Fruit Objec
    }
    /*
    [사과, 사과, 사과]
    [포도, 포도, 포도]
     */
}
