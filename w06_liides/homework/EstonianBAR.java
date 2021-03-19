package homework;

public class EstonianBAR implements BarcodeNR {
    private String code;
  
    public EstonianBAR(String code){
      this.code = code;
    }

    @Override
    public String getCountry() {
        int country = Integer.parseInt(code.substring(0,3));
        if( country == 474) {
            return "Toode on Eestis tehtud";
       }else {
           return "Pole Eestist";
       }
    }

    @Override
    public String getManufacturer() {
        int manu = Integer.parseInt(code.substring(4,7));
        return manu == 125 ? "Alma": "Tere";
    }

    @Override
    public String getProduct() {
        int pro = Integer.parseInt(code.substring(7,9));
        return pro == 58 ? "Jook": "Söök";
	}

 }
