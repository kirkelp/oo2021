package homework;
public class Main {
public static void main(String[] args){
    EstonianBAR est = new EstonianBAR("4740125582703");
    LatviaBAR lat = new LatviaBAR("4750050341405");

    System.out.println(est.getCountry());
    System.out.println(est.getManufacturer());
    System.out.println(est.getProduct());

    System.out.println(lat.getCountry());
    System.out.println(lat.getManufacturer());
    System.out.println(lat.getProduct());
    }
}