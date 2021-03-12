// Luua klass, kus oleksid funktsioonid teisendada arv
//  kümnendsüsteemist kahendsüsteemi, kaheksandsüsteemi, kuueteistkümnendsüsteemi
import java.util.Scanner;

public class Teisendamine {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta kümnendsüsteemi arv");
        int decimal = input.nextInt();
        int bin = decimal;
        int oct = decimal;
        int hex = decimal;
        
        String binary = "";
        String octal = "";
        String hexal = "";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  

        while (bin > 0 || oct > 0 || hex > 0) {

            if (bin > 0) {
                int remainder = bin % 2;
                binary = remainder + binary;
                bin = bin / 2;
            }
            if (oct > 0) {
                int remainder = oct % 8;
                octal = remainder + octal;
                oct = oct / 8;
            }
            if (hex > 0) {
                int reminder = hex % 16;
                hexal=hexchars[reminder]+hexal;   
                hex = hex / 16;
            }
            
            
        }
        
        System.out.println("Kahendsüsteemi number: " + binary);
        System.out.println("Kaheksandsüsteemi number:  " + octal);
        System.out.println("kuueteistkümnendsüsteemi number: " + hexal);
    }
}
