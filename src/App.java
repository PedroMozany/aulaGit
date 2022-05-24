import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);

        if (number % 2 == 0) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

    }


}
