package day14_Exception_langpackage.exam03;

public class MyResource implements AutoCloseable{
    // AutoCloseable 인터페이스 메서드 오버라이딩
    @Override
    public void close() throws Exception {
        System.out.println("MyResource 자원 해제!");
    }
}
