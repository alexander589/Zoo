import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    public static void main(String[] args) throws IOException {

        System.out.println("Please choose: tiger, cat, dog, duck");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        Element element = createObject(input);

        if (element instanceof Fly) {
            ((Fly) element).fly();
        }

        if (element instanceof Run) {
            ((Run) element).run();
        }

        if (element instanceof Climb) {
            ((Climb) element).climb();
        }

    }

    public static Element createObject(String input) {
        switch (input) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "duck":
                return new Duck();
            case "tiger":
                return new Tiger();
            default:
                throw new IllegalArgumentException("pls enter correct string");
        }
    }
}