package Kellamehhanism.Yl1;


// import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws InterruptedException  {
        int vonge;
        // Scanner scanner = new Scanner(System.in);

        Pendel pendel = new Pendel(4);
        int pikkus = pendel.getPikkus();
        // System.out.println("Sisesta pendli pikkus :");
        // double pikkus = scanner.nextDouble();

        double Vonkeperiood = (2*Math.PI)*(Math.sqrt(pikkus/9.8));
        vonge = (int) Vonkeperiood * 1000; // 1000 korrustamisel saab sekundid


        System.out.println("Pendli võnkeperiood on: " + Vonkeperiood);

        while (true) {
            Thread.sleep(vonge / 2); //võnge pooleks
            System.out.println("TIK");
			Thread.sleep(vonge / 2);
            System.out.println("TAK");
        }
    }
}

