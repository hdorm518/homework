package M220109;

public interface Runnable {
    public final String NAME = "뛰자!";
    public void print();    
    default public void print2() {
        System.out.println(NAME);
    }
}
