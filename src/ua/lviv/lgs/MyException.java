package ua.lviv.lgs;

public class MyException extends Exception{

    private String mesenger;

    public MyException(String mesenger) {
        this.mesenger = mesenger;
    }

    public String getMesenger() {
        return mesenger;
    }
}
