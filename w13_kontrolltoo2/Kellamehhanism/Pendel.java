package Kellamehhanism;

public class Pendel {
    double v6nkeperiood;
    double pikkus;

    public Pendel(double v6nkeperiood, double pikkus ){
        this.pikkus = pikkus;
        this.v6nkeperiood= 2 * Math.PI * Math.sqrt(pikkus/9.8);
    

    }

}
