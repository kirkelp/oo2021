package Kellamehhanism.Yl2;

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

        Hammasratas hammasratas = new Hammasratas(5);
        int hammastearv = hammasratas.getHammastearv();

        double Vonkeperiood = (2*Math.PI)*(Math.sqrt(pikkus/9.8));
        vonge = (int) Vonkeperiood * 1000; // 1000 korrustamisel saab sekundid

        System.out.println("Pendli võnkeperiood on: " + Vonkeperiood);
        System.out.println("Hammasratas hakkas pöörlema. ");
       

        int loendur = 0;
        int ring= 0;

        while (true) {
            Thread.sleep(vonge / 2); //võnge pooleks
            System.out.println("TIK");
			Thread.sleep(vonge / 2);
            System.out.println("TAK");
            loendur ++;
            if (loendur== hammastearv){
                ring ++;
                System.out.println("Hammasratas tegi " + ring + " ringi");
                loendur = 0;
            }
            
            }
        }
 }


