package day14_Exception_langpackage.exam03;

public class MyResource2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("MyResource2 자원 해제!");
    }
}
