package day19_CollectionFramework.exam01;

import java.util.LinkedList;
import java.util.Queue;

// Queue -> 큐, 선입선출 좌우 뚫림
public class Ex03 {
    public static void main(String[] args) {
        Queue<String> items = new LinkedList<>();
        items.offer("항목1");
        items.offer("항목2");
        items.offer("항목3");
        items.offer("항목4");
        items.offer("항목5");

        while(items.size() > 0) {
            String item = items.poll();
            System.out.println(item);
        }
    }
}
