package day04_Controlstatements;

//5층 건물이 있습니다. 1층은 약국 2층 정형회과 3층 피부과 4층 치과 5층 헬스클럽입니다.
//건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있을 때 swich ~case문으로 구현하시오.
public class Example3 {
    public static void main(String[] args) {
        int floor = 5;

        switch (floor){
            case 1 :
                System.out.println("1층, 약국입니다.");
                break;
            case 2:
                System.out.println("2층, 정형외과입니다.");
                break;
            case 3:
                System.out.println("3층, 피부과입니다.");
                break;
            case 4:
                System.out.println("4층, 치과입니다.");
                break;
            case 5:
                System.out.println("5층, 헬스클럽입니다");
                break;
            default:
                System.out.println("없는 층입니다.");
        }
    }
}

