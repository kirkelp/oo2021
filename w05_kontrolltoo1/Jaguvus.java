// Teata, kas kasutaja sisestatud arv jagub kahe, kolme viie või seitsmega.
import java.util.Scanner;

public class Jaguvus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        System.out.print("Sisesta number ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("Sisestatud number "+ num +  " jagub kahega");
        }
        if(num % 3 == 0){
            System.out.println("Sisestatud number "+ num +  "jagub kolmega");
        }
        if(num % 5 == 0){
            System.out.println("Sisestatud number "+ num +  " jagub viiega");
        }
        if(num % 7 == 0){
            System.out.println("Sisestatud number "+ num +  " jagub seitsmega");
        }
    }
}