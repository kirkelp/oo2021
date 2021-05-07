package proovikt;

public class Main {
    public static void main(String[] arg) {
        Jook jook = new Jook("Sprite", 1.5, 0.5);
        Joogipudel pudel = new Joogipudel(1,"Klaas", 0.2, 1.0, jook);
    
        System.out.println("- Joogi nimi on " + jook.nimetus);
        System.out.println("- Joogipudeli mass on " + pudel.pudeliMass());
        System.out.println("- Joogipudeli hind on  " + pudel.pudeliHind());
    }
}
