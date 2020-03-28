public class Duck implements Fly, Run {
    @Override
    public void run() {
        System.out.println("Duck is run");
    }
    @Override
    public void fly() {
        System.out.println("Duck is fly");
    }
}
