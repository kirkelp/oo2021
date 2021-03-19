package homework;

public class LatviaBAR implements BarcodeNR {
    private String numbers;
  
    public LatviaBAR(String numbers){
      this.numbers = numbers;
    }
    @Override
    public String getCountry() {
        int country = Integer.parseInt(numbers.substring(0,3));
        if( country == 475) {
            return "Toode on Lätis tehtud";
       }else {
           return "Pole Lätist";
       }
    }

    @Override
    public String getManufacturer() {
        int manu = Integer.parseInt(numbers.substring(0,8));
        if( manu == 47500503) {
            return "Karums";
       }else if( manu == 47500555) {
           return "Maxima";
       }else {
        return "Pole Läti tehas";
        }
     }

    
    @Override
    public String getProduct() {
        int pro = Integer.parseInt(numbers.substring(9,12));
        if( pro == 40) {
            return "Jook";
       }else {
           return "Söök";
       }
    }
}