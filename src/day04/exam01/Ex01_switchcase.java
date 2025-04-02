package day04.exam01;

// 스위치/케이스 문
public class Ex01_switchcase {
    public static void main(String[] args) {
        int rank = 1;
        switch (rank) {
            //case 값 = 전부 정수.  'A' -case 값으로 가능, 문자형(char) : 양의 정수
            case 1:
                System.out.println("금메달입니다.");
                break;
            case 2:
                System.out.println("은메달입니다.");
                break;
            case 3:
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("아쉽습니다.");
        } // s end
    } // m end
} // c end
// switch - case 는 적용되는 시점부터 아래로 쭉 실행됨 rank가 2일땐 case 2, 3 다 실행
// break; -> 거기까지 하고 실행 종료
// default: -> 키워드 값이외에