public class Cat implements Climb, Run {
    @Override
    public void run() {
        System.out.println("Cat is run");
    }
    @Override
    public void climb() {
        System.out.println("Cat is climb");
    }
}
