public class MyFirstException extends Exception{
    private String info;
    int a;
    public MyFirstException(String info, int a){
        this.info = info;
        this.a = a;
    }

    @Override
    public String toString() {
        return "MyFirstException{" +
                "info='" + info + a + '\'' +
                '}';
    }
}
