package day04_Controlstatements;

// do - while
public class Ex03_dowhile {
        public static void main(String[] args) {
            int num = 1, total = 0;
            // num : 증가하는 수, total - 증가하는 수를 더한 값
            do {
                total += num;        //반복 수행 코드
                num++;
            } while (num <= 100);

            System.out.println(total);
        }
//do-while 반복문은 위에서 아래로, while이 false여도 한번은 실행됨
}
