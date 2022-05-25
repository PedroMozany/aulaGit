import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int cont = 0, repeat = 5;

            while (repeat != 0 ) {
                System.out.println("type 0 for flip \ntype 1 for coin");
                int resp = sc.nextInt();
                int moeda = lançarMoeda();

                if (resp == moeda) {
                    System.out.println("Rigth!!\n");
                    ++cont;
                    --repeat;
                } else {
                    System.out.println("failed!!\n");
                    --repeat;
                }
            }

            System.out.println("Pontuação:" + cont);
        }

        public static int lançarMoeda() {
            Random random = new Random();
            int number = random.nextInt(2);
            if (number % 2 == 0) {
                System.out.println("Result: flip");
                return 0;
            }else{
                System.out.println("Result: coin");
                return 1;
            }

        }
    }
