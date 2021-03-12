//Teata, kas kasutaja sisestatud arv on algarv.
import java.util.Scanner;

public class Algarv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        System.out.print("Sisesta number ");
        int num = in.nextInt();
        boolean isPrime = true;

    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime)
      System.out.println("Sisestatud number "+ num +  " on algarv");
    else
      System.out.println("Sisestatud number "+ num +  " ei ole algarv");
  }
}