package day16.exam05;

import java.util.List;

public class Juicer {
    // 와일드 카드 : ? ->Fruit, Apple, Grape
    public static void make(FruitBox<? extends Fruit> fruitBox){
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    // ? -> Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> fruitBox){
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }


    public static void make3(FruitBox<? super Apple> fruitBox, FruitBox<? super Apple> fruitBox2){
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }
    //위의 형태와 같음
    public static <T extends Fruit, U extends  Fruit> void make4
    (FruitBox<T> fruitBox, FruitBox<U> fruitBox2){
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make5(FruitBox<T> fruitBox){

    }


//    public static void make(FruitBox<?> grapeBox){ // 메서드 중복정의 - 제네릭타입은 Object로 컴파일 되기 때문에
//        List<?> items = grapeBox.getItems();
//        System.out.println(items);
//    }

    /*
        메서드 이름 | 허용 타입 | 목적
        make | ? extends Fruit | 과일이거나 자식 타입만
        make2 | ? super Apple | Apple 넣을 수 있는 박스 (Apple 이상)
        make3 | ? super Apple x2 | 위와 같지만 2개
        make4 | <T extends Fruit, U extends Fruit> | 다양한 과일 박스를 받아들임
        make5 | <T extends Fruit> | 하나의 과일 박스, 타입 추론에 용이
     */

}
