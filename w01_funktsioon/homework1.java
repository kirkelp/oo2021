import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        System.out.print("Input your age: ");
        int num1 = in.nextInt();
        String result = (num1 < 14 ) ? "Access denied -You are not old enough!." : "Access granted - You are old enough!";
        System.out.println(result); 
       }
}
