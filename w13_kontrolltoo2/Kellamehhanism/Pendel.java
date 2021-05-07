package Kellamehhanism;

public class Pendel {
    double v6nkeperiood;
    int tiksumine = 0;
    int ringid = 0;


    public Pendel(Double pikkus){
        v6nkeperiood = 2 * Math.PI * Math.sqrt(pikkus/9.8);
    }

    public String tiksumised(){
         tiksumine = tiksumine + 1;
         return "tik tok";
    }
    
}
