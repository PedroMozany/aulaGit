import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cont = 0, repeat = 5;

        while (repeat != 0) {
            System.out.println("type 0 for flip \n" + "type 1 for coin");
            int resp = sc.nextInt();
            if (resp == 0) {
                System.out.println("Rigth!!");
                cont++;
                repeat--;
            } else if (resp == 1) {
                System.out.println("Rigth!!");
                cont++;
                repeat--;
            }else{
                System.out.println("Invalid option.");
            }
        }
        System.out.println("Pontuação:" + cont);
    }


}
