package day18_Annotation.exam01;

//@Override // ( Override 는 메서드 에만 가능 )
public class Ex01 {
    // Object 클래스의 toString() 메서드 재정의,
    @Override
    public String toString() {
        return super.toString();
    }
    /*
    * "정말로 부모 클래스에 같은 시그니처의 메서드가 있나?"를 체크해줌
      실수로 메서드 이름을 틀렸거나 시그니처가 다르면 컴파일 오류 발생시킴
            (EX)
            @Override
            public String tostring() { // 잘못된 이름 (toString 아님)
            return "실수!";
        }

    * */
    public static void main(String[] args) {

    }
}
