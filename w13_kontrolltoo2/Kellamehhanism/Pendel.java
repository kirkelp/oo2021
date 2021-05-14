package Kellamehhanism;

public class Pendel {
    private double pikkus;
    double vp;


    public Pendel(Double pikkus){
        this.pikkus = pikkus;
    }
    public double getPikkus(){
        return pikkus;
    }

    public double V6nkeperiood(){
        vp = 2 * Math.PI * Math.sqrt(pikkus/9.8);
        return vp;
    }
    
    
}
