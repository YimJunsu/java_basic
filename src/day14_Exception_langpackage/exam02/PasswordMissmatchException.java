package day14_Exception_langpackage.exam02;

public class PasswordMissmatchException extends RuntimeException{
    public PasswordMissmatchException(String message){
        super(message);
    }
}
